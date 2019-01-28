package com.Codecool;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class FactParser extends XMLParser {

    FactRepository factRepo;

    public FactRepository getFactRepo() {
        return factRepo;
    }

    @Override
    public void loadXMLDocument(String path) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(new File(path));

            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Fact");


            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                if (nNode.getNodeType() == nNode.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String id = eElement.getAttribute("id");
                    NodeList child = eElement.getChildNodes();
                    Node cucc = child.item(0);
                    if (cucc.getNodeType() == cucc.ELEMENT_NODE) {
                        Element childElement = (Element) cucc;
                        String description = childElement.getAttribute("value");

                        factList.add(factRepo.new Fact(id, description));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
