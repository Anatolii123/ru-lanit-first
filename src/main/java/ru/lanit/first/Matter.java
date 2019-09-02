package ru.lanit.first;

import java.util.Scanner;

abstract class Matter {

    protected String science;
    protected boolean mathDescription;

    protected Matter(){}

    public abstract void printClass();
    public abstract void printAncestor();
    public abstract void printDescendants();

//    public static Matter getInstanceOf(){
//        Matter m = new Matter();
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите название науки: ");
//        m.science = in.nextLine();
//        System.out.println("Можно ли математически описать: ");
//        if (in.nextLine() == "Да") {
//            m.mathDescription = true;
//        }
//        m.mathDescription = false;
//        return m;
//    }
}

