package com.HW1.ThirdLvl;

import com.HW1.SecondLvl.PrintedEdition;

public class NewsPaper extends PrintedEdition {

    protected String caption;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "NewsPaper{" +
                "caption='" + caption + '\'' +
                ", circulation=" + circulation +
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
