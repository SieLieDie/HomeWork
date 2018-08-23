package com.epam.SAX;

public class Book {
    String name;
    String author;
    String lang;

    public Book(String name, String author, String lang) {
        this.name = name;
        this.author = author;
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
