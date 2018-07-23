package com.Epam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LettersReplacer {
    /* A3
    * В тексте после буквы Р, если она не последняя в слове,ошибочно напечатана буква А вместо О.
    * Внести исправления в текст.
      */

    public static void main(String[] args) {
        String text = "Police, polite, passion";
        String regexLowerLetter = "(po)";
        String regexUpperLetter = "(Po)";
        Pattern pattern = Pattern.compile(regexLowerLetter);
        Matcher matcher = pattern.matcher(text);
        String changeLowerLetters = "";
        String changeFinalText = "";
        while (matcher.find()) {
            changeLowerLetters = matcher.replaceAll("pa");
        }
        Pattern patternUpperLetter = Pattern.compile(regexUpperLetter);
        Matcher matcherUpperLetter = patternUpperLetter.matcher(changeLowerLetters);
        while (matcherUpperLetter.find()){
            changeFinalText = matcherUpperLetter.replaceAll("Pa");
        }

        System.out.println(changeFinalText);
    }
}
