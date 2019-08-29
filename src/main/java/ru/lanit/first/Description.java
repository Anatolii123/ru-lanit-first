package ru.lanit.first;

import java.io.Serializable;
import java.util.List;

public enum Description {
    Science("physics"),
    MathDescription(true),
    Mass("mass"),
    State("state"),
    Intensity("intensity");

    private String description;
    private boolean mathDescription;
    private int mass;

    Description(String description) {
        this.description = description;
    }
    Description(boolean mathDescription) {
        this.mathDescription = mathDescription;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
