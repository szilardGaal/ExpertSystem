package com.Codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class RuleParser extends XMLParser {

    RuleRepository ruleRepo = new RuleRepository();
    List<Rule> ruleList = new ArrayList<>();
    String filePath;

    public RuleParser(String path) {
        filePath = path;
        loadXMLDocument(path);
    }

    public RuleRepository getRuleRepository() {
        return ruleRepo;
    }

    public void load() {
            try {
                NodeList nList = doc.getElementsByTagName("Rule");

                for (int i = 0; i < nList.getLength(); i++) {
                    Node nNode = nList.item(i);

                    if (nNode.getNodeType() == nNode.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        String id = eElement.getAttribute("id");
                        NodeList children = eElement.getChildNodes();
                        List<Element> actualElements= new ArrayList<>();

                        for (int j=0; j < children.getLength(); j++ ) {
                            if (children.item(j).getNodeType() == children.item(j).ELEMENT_NODE) {
                                actualElements.add((Element) children.item(j));
                            }
                        }

                        Node child = actualElements.get(0);
                        Rule rule;
                        if (child.getNodeType() == child.ELEMENT_NODE) {
                            Element descriptionElement = (Element) child;
                            String description = descriptionElement.getTextContent();
                            rule = new Rule(id, description);
                            ruleRepo.addRule(rule);
                            rule.setFactValueById(id, false);
                                }
                            }
                        }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
