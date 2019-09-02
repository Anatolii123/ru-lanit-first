package ru.lanit.first;

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class QuantumFields extends Matter implements Physics, Informatics{

    protected QuantumFields(){}

    public void force() {
        System.out.println("It has.");
    }

    @Override
    public void setOrdinal() {
        System.out.println("Hello");
    }

    @Override
    public String getClassName() {
        return "Quantum Fields";
    }

    @Override
    public Set<Philosophy> calculate(Philosophy quantum) {
        Set<Philosophy> quantums = new HashSet<Philosophy>();
        for (int i = 0; i < 5; i++) {
            quantums.add(new Field());
        }
        return quantums;
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
