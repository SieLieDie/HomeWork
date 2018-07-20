package com.Epam;

import java.util.ArrayList;
import java.util.ListIterator;

public class ExampleThree {
    public static void main(String[] args) {
        /* B2
         * Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них
         */

        String text = "Понятие содержание высказывания связано с категорией информативности речи понимание отношений между явлениями и присуще только тексту. " +
                "Оно сообщает читателю индивидуально-авторское , их значимости во всех " +
                "сферах придают ему смысловую цельность.";
        String[] arraySentence = text.split("\\u002E\\s");
        ArrayList<String[]> arrayList = new ArrayList<>();
        for (int i = 0; i < arraySentence.length; i++) {
            arrayList.add(arraySentence[i].split("\\s"));
        }
        ListIterator<String[]> listIterator = arrayList.listIterator();
        for (String[] a:arrayList) {
            for (String b:a) {
                System.out.println(b);
            }

        }
    }
}
