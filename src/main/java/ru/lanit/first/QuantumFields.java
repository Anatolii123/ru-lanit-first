package ru.lanit.first;

import java.util.HashMap;
import java.util.Map;

public class QuantumFields extends Matter {

    protected QuantumFields(){}

    public void mathDescription() {
        System.out.println("It has.");
    }

    public void force() {
        System.out.println("It has.");
    }

    public void reason() {
        System.out.println("Unknown.");
    }

    public void amountOfInformation() {
        System.out.println("A lot of!");
    }

    public void calculate() {
        //TODO прошу реализовать пример HashMap, причём, так, чтобы ключами были экзепляры твоих собственных классов. Для этого нужно выполнить некие предварительные действия над классами. Прочитать в книге (нагуглить), что это зто действия.
        Map<Integer, QuantumFields> quantumFields = new HashMap<Integer, QuantumFields>();
        for (int i=0;i<5;i++) {
            quantumFields.put(i,new QuantumFields());
        }
        for (int q=0;q<5;q++) {
            //QuantumFields f = quantumFields.get(q);
            quantumFields.get(q).printClass();
            System.out.println(quantumFields.containsKey(q));
        }
    }

    @Override
    public void printClass() {
        System.out.println("Quantum Fields");
    }

    @Override
    public void printAncestor() {
        System.out.println("Matter");
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }

    public static QuantumFields getInstanceOf(){
        QuantumFields q = new QuantumFields();
        return q;
    }

    public void printSentence(){
        System.out.println("This is a Quantum Field.");
    }
}
