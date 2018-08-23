package com.epam;


import com.epam.entity.Book;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Book aliceAdventures = new Book(1,"Alice’s Adventures in Wonderland","Lewis Carroll","Fable","ENG");
        aliceAdventures.setDescription("src\\com\\epam\\entity\\resourseForDescription\\Alice’s Adventures in Wonderland.txt");
        aliceAdventures.setText("src\\com\\epam\\entity\\resourceForTextBook\\Alice’s Adventures in Wonderland.txt");
        System.out.println(aliceAdventures);

        Book littlePrince = new Book(2,"The Little Prince","Antoine de Saint-Exupery", "Fable", "ENG");
        littlePrince.setDescription("src\\com\\epam\\entity\\resourseForDescription\\The Little Prince.txt");
        littlePrince.setText("src\\com\\epam\\entity\\resourceForTextBook\\The Little Prince.txt");
        System.out.println(littlePrince);

        Book nineteenEightyFour = new Book(3,"1984","George Orwell", "Dystopia", "RU");
        nineteenEightyFour.setDescription("src\\com\\epam\\entity\\resourseForDescription\\1984.txt");
        nineteenEightyFour.setText("src\\com\\epam\\entity\\resourceForTextBook\\1984.txt");
        System.out.println(nineteenEightyFour);

    }
}
