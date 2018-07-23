package com.Epam;

import java.util.LinkedList;
import java.util.List;

public class StringGetter {
    public static void main(String[] args) {

        /* С2
       * Получить из текста подстроку максимальной длины,
       * начинающуюся и заканчивающуюся одним и тем же символом.
         */

        String text = "Word word word word word. Word word draw? Word word word draw";
        String delimiter = "([\\u002E?!]\\s)";
        String bubble = "";
        int maxLength = 0;
        char ch;
        char ch1;
        String[] textArr = text.split(delimiter);
        List<String> list = new LinkedList<>();
        for (int i = 0; i < textArr.length; i++) {
            list.add(textArr[i]);
        }
        for (String s:list) {
            ch = s.toLowerCase().charAt(0);
            ch1 = s.charAt(s.length()-1);
            if (ch == ch1) {
                if (s.length() > maxLength) {
                    maxLength = s.length();
                    bubble = s;
                }
            }
        }
        System.out.println(bubble);
    }
}
