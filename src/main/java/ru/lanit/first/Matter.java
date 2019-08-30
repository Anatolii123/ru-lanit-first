package ru.lanit.first;

import java.util.Scanner;

public class Matter {
    protected String science;
    protected boolean mathDescription;

    public void printClass() {
        System.out.println("Matter");
    }
    public void printAncestor() {
        System.out.println("Object");
    }
    public void printDescendants() {
        System.out.println(Descendants.values());
    }

    public static Matter getInstanceOf(){
        Matter m = new Matter();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название науки: ");
        m.science = in.toString();
        System.out.print("Можно ли математически описать: ");
        if (in.toString() == "Да") {
            m.mathDescription = true;
        }
        m.mathDescription = false;
        return m;
    }

    enum Descendants{
        Substance,
        Field,
        QuantumFields,
        ObscurePhysicalNature
    }
}

