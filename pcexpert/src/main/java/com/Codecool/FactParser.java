package com.Codecool;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FactParser extends XMLParser {

    FactRepository factRepo = new FactRepository();
    List<Fact> factList = new ArrayList<>();
    String filePath;

    public FactParser(String path) {
        filePath = path;
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
                    NodeList child = eElement.getChildNodes();
                    Node lol = child.item(1);
                    if (lol.getNodeType() == lol.ELEMENT_NODE) {
                        Element whatever = (Element) lol;
                        String description = whatever.getAttribute("value");
                        factList.add(new Fact(id, description));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
