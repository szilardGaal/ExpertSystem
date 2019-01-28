package com.Codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.List;
import java.util.ArrayList;

public class FactParser extends XMLParser {

    FactRepository factRepo = new FactRepository();

    public FactParser(String path) {
        loadXMLDocument(path);
    }

    public FactRepository getFactRepo() {
        return factRepo;
    }

    public void load() {
        try {
            NodeList nList = doc.getElementsByTagName("Fact");

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
                    Fact fact;
                    if (child.getNodeType() == child.ELEMENT_NODE) {
                        Element descriptionElement = (Element) child;
                        String description = descriptionElement.getAttribute("value");
                        fact = new Fact(id, description);
                        factRepo.addFact(fact);

                        NodeList values = actualElements.get(1).getChildNodes();
                        for (int k=0; k < values.getLength(); k ++) {
                            String name = ((Element) values.item(k)).getAttribute("id");
                            Boolean bool = Boolean.valueOf(values.item(k).getTextContent());
                            fact.setFactValueById(name, bool);
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
