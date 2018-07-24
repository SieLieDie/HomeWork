package com.Epam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleTwentyTwo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Java");
        String candidateString = "I love Java2s. Java2s is about Java.";
        Matcher matcher = p.matcher(candidateString);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
