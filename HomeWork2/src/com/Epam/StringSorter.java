package com.Epam;

import java.util.*;

public class StringSorter {
    public static void main(String[] args) {
        /* B6
         * Напечатать слова текста в алфавитном порядке по первой букве.
         * Слова, начинающиеся с новой буквы, печатать с красной строки.
         */

        String text = "Aaa vvv ddd abc vcd dsd dss";
        String[] arrayText = text.split("\\s");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayText.length; i++) {
            arrayList.add(arrayText[i]);
        }
        Collections.sort(arrayList);
        ListIterator<String> iterator = arrayList.listIterator();
        System.out.println(iterator.next());
        while (iterator.hasNext()){
            if (iterator.next().substring(0,1).equals(iterator.previous().substring(0,1))){
                System.out.print(iterator.next()+" ");
            }else{
                System.out.println("\n" + iterator.next());
            }
        }
    }
}
