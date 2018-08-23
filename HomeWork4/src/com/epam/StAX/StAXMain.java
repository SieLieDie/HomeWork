package com.epam.StAX;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

public class StAXMain {
    public static void main(String[] args) throws XMLStreamException {
        StringReader stringReader = new StringReader("src\\com\\epam\\BookList.xml");
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader streamReader = factory.createXMLStreamReader(stringReader);

    }

}
