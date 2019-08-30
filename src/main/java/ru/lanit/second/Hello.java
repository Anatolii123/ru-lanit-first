package ru.lanit.second;

import ru.lanit.first.Description;
import ru.lanit.first.ElectricField;

import java.util.List;

public class Hello {
    public static void main (String[] args) throws Exception {

        for (Description d: Description.values()) {
            if (d.equals(d)){
                //System.out.println(Description.getBy("physics"));
                //System.out.println(Description.valueOf(d.toString()));
                //System.out.println();
            }
        }
        System.out.println(Description.getBy("physics"));
        System.out.println(Description.getBy(10));
        System.out.println(Description.getBy(false));
        System.out.println();



    }
}
