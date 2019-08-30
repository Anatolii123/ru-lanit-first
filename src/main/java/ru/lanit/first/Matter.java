package ru.lanit.first;

import java.util.Scanner;

public class Matter {

    protected String science;
    protected boolean mathDescription;

    protected Matter(){}

    public void printClass() {
        System.out.println("Matter");
    }
    public void printAncestor() {
        System.out.println("Object");
    }
    public void printDescendants() {
        System.out.println(MatterDescendants.values());
    }

    public static Matter getInstanceOf(){
        Matter m = new Matter();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название науки: ");
        m.science = in.nextLine();
        System.out.println("Можно ли математически описать: ");
        if (in.nextLine() == "Да") {
            m.mathDescription = true;
        }
        m.mathDescription = false;
        return m;
    }

}

