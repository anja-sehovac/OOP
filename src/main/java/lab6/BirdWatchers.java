package lab6;

import java.util.*;

public class BirdWatchers {

    private String name;
    private String latinName;
    private int observationCount;


    public BirdWatchers(String name, String latinName) {

        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }


    public String getName() {
        return this.name;

    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObservationCount() {
        return this.observationCount;
    }

    public void observe() {
        this.observationCount++;
    }

}
