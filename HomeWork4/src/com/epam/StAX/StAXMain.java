package com.epam.StAX;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class StAXMain {
    public static void main(String[] args) throws XMLStreamException {
        String file = "src\\com\\epam\\BookList.xml";
        List<Book> bookList = parseXML(file);
        for (Book book : bookList){
            System.out.println(book.toString());
        }
    }

    private static List<Book> parseXML(String file) {
        List<Book> bookList = new LinkedList<>();
        Book book = null;
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader eventReader = inputFactory.createXMLEventReader(new FileInputStream(file));
            while (eventReader.hasNext()) {
                XMLEvent xmlEvent = eventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("book")) {
                        book = new Book();
                        Attribute nameAttr = startElement.getAttributeByName(new QName("name"));
                        book.setName(nameAttr.getValue());
                        Attribute authorAttr = startElement.getAttributeByName(new QName("author"));
                        book.setAuthor(authorAttr.getValue());
                        Attribute langAttr = startElement.getAttributeByName(new QName("lang"));
                        book.setLang(langAttr.getValue());
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("book")) {
                        bookList.add(book);
                    }
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
