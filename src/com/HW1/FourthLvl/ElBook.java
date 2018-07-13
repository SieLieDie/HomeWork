package com.HW1.FourthLvl;

import com.HW1.ThirdLvl.FileEdition;

public class ElBook extends FileEdition {

    protected int quantityPage;

    public int getQuantityPage() {
        return quantityPage;
    }

    public void setQuantityPage(int quantityPage) {
        this.quantityPage = quantityPage;
    }

    @Override
    public String toString() {
        return "ElBook{" +
                "quantityPage=" + quantityPage +
                ", fileFormat='" + fileFormat + '\'' +
                ", source='" + source + '\'' +
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
