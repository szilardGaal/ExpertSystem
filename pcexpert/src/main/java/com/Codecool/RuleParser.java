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
            NodeList nList = doc.getElementsByTagName("Rules");

            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                if (nNode.getNodeType() == nNode.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String id = eElement.getAttribute("id");
                    NodeList child = eElement.getChildNodes();
                    Node lol = child.item(1);
                    if (lol.getNodeType() == lol.ELEMENT_NODE) {
                        Element whatever = (Element) lol;
                        String description = whatever.getAttribute("value");
                        ruleList.add(new Rule(id, description));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
