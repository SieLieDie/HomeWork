package com.epam.StAX;


import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

public class XMLReader {

    public void parse(InputStream inputStream) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(inputStream);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void process(XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            String name = reader.getAttributeValue(1);
            String author = reader.getAttributeValue(2);
            String lang = reader.getAttributeValue(3);
            System.out.println(String.format("Книга: %s, Автор: %s, Язык: %s",name,author,lang));
        }
    }
}
