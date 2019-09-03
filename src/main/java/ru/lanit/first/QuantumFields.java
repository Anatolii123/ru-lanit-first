package ru.lanit.first;

import java.util.*;

public class QuantumFields extends Matter implements Physics, Informatics{

    protected QuantumFields(){}

    @Override
    public void setScience() {
        science = "quantum physics";
    }

    @Override
    public void setMathDescription() {
        mathDescription = true;
    }

    @Override
    public void setOrdinal() {
        ordinal = 2;
    }

    @Override
    public String getClassName() {
        return "Quantum Fields";
    }

    @Override
    public int hashCode() {
        int[] h = {ordinal, science.length()};
        return Arrays.hashCode(h)+this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        boolean a = this.hashCode() == o.hashCode() && this.getClass() == o.getClass()
                && ((Matter) o).mathDescription == this.mathDescription && ((Matter) o).science == this.science
                && ((Matter) o).ordinal == ordinal;
        return a;
    }

    public void force() {
        System.out.println("It has.");
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

    public static void calculate(QuantumFields q) {
        //TODO прошу реализовать пример HashMap, причём, так, чтобы ключами были экзепляры твоих собственных классов. Для этого нужно выполнить некие предварительные действия над классами. Прочитать в книге (нагуглить), что это зто действия.
        Map<QuantumFields,Integer> quantumFields = new HashMap<QuantumFields, Integer>();
        quantumFields.put(q,q.hashCode());
        System.out.println(quantumFields.get(q));
//        for (int i=0;i<5;i++) {
//            quantumFields.put(i,new QuantumFields());
//        }
//        for (int q=0;q<5;q++) {
//            //QuantumFields f = quantumFields.get(q);
//            quantumFields.get(q).printClass();
//            System.out.println(quantumFields.containsKey(q));
//        }
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
