package com.Codecool;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public abstract class XMLParser {

    Document doc;

    public void loadXMLDocument(String path) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            doc = docBuilder.parse(new File(path));
            doc.getDocumentElement().normalize();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
