package com.epam.SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SAXMain {
    private static List<Book> bookList = new ArrayList<Book>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        javax.xml.parsers.SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        XMLReader xmlReader = new XMLReader();
        parser.parse(new File("src\\com\\epam\\BookList.xml"), xmlReader);
        for (Book book:bookList){
            System.out.println(String.format("Книга: %s, Автор: %s, Язык: %s", book.getName(),book.getAuthor(),book.getLang()));
        }

    }

    private static class XMLReader extends DefaultHandler {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

            if (qName.equals("book")) {
                String name = attributes.getValue("name");
                String author = attributes.getValue("author");
                String lang = attributes.getValue("lang");
                bookList.add(new Book(name,author,lang));
            }
        }
    }
}
