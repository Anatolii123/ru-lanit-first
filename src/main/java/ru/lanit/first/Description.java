package ru.lanit.first;

import java.util.List;

public enum Description  {
    Science("physics"),
    MathDescription("math"),
    Mass("mass"),
    State("state"),
    Intensity("intensity");

    private String description;

    Description(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
