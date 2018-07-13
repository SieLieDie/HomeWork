package com.HW1.ThirdLvl;

import com.HW1.SecondLvl.ElEdition;

public class FileEdition extends ElEdition {

    protected String fileFormat;

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return "FileEdition{" +
                "fileFormat='" + fileFormat + '\'' +
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
