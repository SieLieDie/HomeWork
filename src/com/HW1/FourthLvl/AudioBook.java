package com.HW1.FourthLvl;

import com.HW1.ThirdLvl.FileEdition;

public class AudioBook extends FileEdition{

    protected int durability;

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "durability=" + durability +
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
