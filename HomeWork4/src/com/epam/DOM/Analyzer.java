package com.epam.DOM;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.util.ArrayList;


public class Analyzer {
    public static ArrayList<Book> bookListBuilder(Element root) throws SAXException, IOException {
        ArrayList<Book> bookList = new ArrayList<Book>();
        NodeList bookNodes = root.getElementsByTagName("book");
        Book book = null;
        for (int i = 0; i < bookNodes.getLength(); i++) {
            book = new Book();
            Element bookElement = (Element) bookNodes.item(i);
            book.setName(bookElement.getAttribute("name"));
            book.setAuthor(bookElement.getAttribute("author"));
            book.setLang(bookElement.getAttribute("lang"));
            bookList.add(book);
        }
        return bookList;
    }
}


