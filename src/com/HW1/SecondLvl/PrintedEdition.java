package com.HW1.SecondLvl;

import com.HW1.FirstLvl.Edition;

public class PrintedEdition extends Edition {

    protected int circulation;
    protected int numberOfPages;

    public int getCirculation() {
        return circulation;
    }

    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "PrintedEdition{" +
                "circulation=" + circulation +
                ", numberOfPages=" + numberOfPages +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", genre='" + genre + '\'' +
                ", cost=" + cost +
                ", language='" + language + '\'' +
                '}';
    }
}
