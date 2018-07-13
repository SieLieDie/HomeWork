package com.HW1.ThirdLvl;

import com.HW1.SecondLvl.PrintedEdition;

public class Book extends PrintedEdition {

    protected enum typeOfBinding {
        SOFT, SOLID, NONE;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", genre='" + genre + '\'' +
                ", cost=" + cost +
                ", language='" + language + '\'' +
                "circulation=" + circulation +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
