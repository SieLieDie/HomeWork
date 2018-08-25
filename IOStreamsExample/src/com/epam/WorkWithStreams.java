package com.epam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WorkWithStreams {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("text.txt");
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw = new PrintWriter(br);
            pw.println("I'm a sentence in a text-file.");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



