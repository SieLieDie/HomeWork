package com.epam.DOM;

import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class DOMMain {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse("src\\com\\epam\\BookList.xml");
        Element root = document.getDocumentElement();
        ArrayList<Book> bookList = Analyzer.bookListBuilder(root);
        for (Book book: bookList) {
            System.out.println(book.toString());
        }
    }
}


