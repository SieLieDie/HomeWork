package com.epam.entity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Book {
    private long id;
    private String name;
    private String author;
    private String lang;
    private String genre;
    private StringBuilder description; // need file
    private StringBuilder text;        // need file

    public Book(long id, String name, String author, String genre, String lang) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.lang = lang;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public StringBuilder getDescription() {
        return description;
    }

    public void setDescription(String address) throws FileNotFoundException {
        StringBuilder desc = new StringBuilder();
        int counter = 0;
        FileReader fileReader = new FileReader(address);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNext()) {
            if (counter == 20) {
                desc.append("\n");
                counter = 0;
            }
            desc = desc.append(scanner.next() + " ");
            counter++;
        }
        this.description = desc;
    }

    public StringBuilder getText() {
        return text;
    }

    public void setText(String address) throws FileNotFoundException {
        StringBuilder textBook = new StringBuilder();
        int counter = 0;
        FileReader fileReader = new FileReader(address);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNext()) {
            if (counter == 20) {
                textBook.append("\n");
                counter = 0;
            }
            textBook.append(scanner.next() + " ");
            counter++;
        }
        this.text = textBook;
    }

    @Override
    public String toString() {
        return name + "(Автор: " + author + "; Жанр: " + genre + "; Язык: " + lang + ")\n\n ==== Предисловие ==== \n" +
                description + "\n\n ==== Текст ====\n" + text + "\n =================================================\n";

    }
}
