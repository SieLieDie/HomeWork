package com.Epam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleOne {
    /* A3
    * В тексте после буквы Р, если она не последняя в слове,ошибочно напечатана буква А вместо О.
    * Внести исправления в текст.
      */

    public static void main(String[] args) {
        String text = "Police, polite, passion";
        String regex = "(po)";
        StringBuilder stringBuilder = new StringBuilder(text);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringBuilder);
        while (matcher.find()) {
            matcher.replaceAll("pa");
        }
        System.out.println(stringBuilder);
    }
}
