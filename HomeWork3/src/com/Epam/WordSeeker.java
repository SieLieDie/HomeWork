package com.Epam;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSeeker {

    /* A3
     * В каждой строке найти слова, начинающиеся с гласной буквы.
     */
    public static void main(String[] args) throws IOException {
        String regex = "\\s[a|A|e|E|y|Y|u|U|i|I|o|O]\\w+";
        StringBuilder text = new StringBuilder();
        FileReader reader = new FileReader("C:\\Epam\\HomeWork3\\src\\com\\Epam\\text.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            text = text.append(scanner.next() + " ");
        }
        reader.close();

        System.out.println(text);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
