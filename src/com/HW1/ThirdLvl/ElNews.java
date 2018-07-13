package com.HW1.ThirdLvl;

import com.HW1.SecondLvl.ElEdition;

public class ElNews extends ElEdition {

    protected String caption;
    protected Boolean relevance;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Boolean getRelevance() {
        return relevance;
    }

    public void setRelevance(Boolean relevance) {
        this.relevance = relevance;
    }

    @Override
    public String toString() {
        return "ElNews{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", genre='" + genre + '\'' +
                ", cost=" + cost +
                ", language='" + language + '\'' +
                "source='" + source + '\'' +
                "caption='" + caption + '\'' +
                ", relevance=" + relevance +
                '}';
    }

}
