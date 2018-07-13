package com.HW1.SecondLvl;

import com.HW1.FirstLvl.Edition;

public class ElEdition extends Edition {

    protected String source; //Источник предоставляемый в виде ссылки на интернет ресурс

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "ElEdition{" +
                "source='" + source + '\'' +
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
