package com.HW1;

import com.HW1.ThirdLvl.Book;
import com.HW1.ThirdLvl.ElNews;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        Book b1=new Book();
        b1.setYearOfPublishing("2019");
        System.out.println(b1);
        b1.setYearOfPublishing("1953");
        System.out.println(b1);
        b1.setYearOfPublishing("-67");
        System.out.println(b1);
    }
}
