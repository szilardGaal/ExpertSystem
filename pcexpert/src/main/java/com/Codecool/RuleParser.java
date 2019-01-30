package com.Codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class RuleParser extends XMLParser {

    private RuleRepository ruleRepo = new RuleRepository();

    public RuleParser(String path) {
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
                    List<Element> actualElements = new ArrayList<>();

                    for (int j = 0; j < children.getLength(); j++) {
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
                        Node answers = actualElements.get(1);
                        NodeList answersChildren = answers.getChildNodes();
                        for (int l = 1; l < answersChildren.getLength(); l++) {
                            Node answersChild = answersChildren.item(l);
                            System.out.println("0");
                            if (answersChild.getNodeType() == answersChild.ELEMENT_NODE) {
                                System.out.println("1");
                                Element answersChildElement = (Element) answersChild;
                                boolean answerValue = Boolean.valueOf(answersChildElement.getAttribute("value"));
                                NodeList answersGrandchildren = answersChild.getChildNodes();
                                for (int m = 0; m < answersGrandchildren.getLength(); m++) {
                                    Node answersGrandchild = answersGrandchildren.item(m);
                                    if (answersGrandchild.getNodeType() == answersGrandchild.ELEMENT_NODE) {
                                        String answerKey = ((Element) answersGrandchild).getAttribute("value");
                                        rule.setRuleValueById(answerKey, answerValue);
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
