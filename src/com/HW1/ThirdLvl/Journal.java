package com.HW1.ThirdLvl;

import com.HW1.SecondLvl.PrintedEdition;

public class Journal extends PrintedEdition {

    protected boolean availabilityOfProbes;

    public boolean isAvailabilityOfProbes() {
        return availabilityOfProbes;
    }

    public void setAvailabilityOfProbes(boolean availabilityOfProbes) {
        this.availabilityOfProbes = availabilityOfProbes;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "availabilityOfProbes=" + availabilityOfProbes +
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
