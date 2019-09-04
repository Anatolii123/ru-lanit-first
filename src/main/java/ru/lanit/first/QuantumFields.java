package ru.lanit.first;

import java.security.KeyStore;
import java.util.*;

public class QuantumFields extends Matter implements Physics, Informatics{

    private Boolean switcher;

    protected QuantumFields(){}

    @Override
    public String getClassName() {
        return "Quantum Fields";
    }

    public void setSwitcher(Boolean switcher) {
        this.switcher = switcher;
    }


    @Override
    public boolean equals(Object o) {
        if(o instanceof QuantumFields){
            if (Boolean.TRUE.equals(switcher)) {
                return true;
            }
            //this.switcher = 1;
            return super.equals(o);
        }

        return false;
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

    public static void calculate(List<QuantumFields> q) {
        //TODO прошу реализовать пример HashMap, причём, так, чтобы ключами были экзепляры твоих собственных классов. Для этого нужно выполнить некие предварительные действия над классами. Прочитать в книге (нагуглить), что это зто действия.
        Map<QuantumFields, Integer> quantumFields = new HashMap<QuantumFields, Integer>();

        for (QuantumFields quantumField: q) {
            quantumFields.put(quantumField,quantumField.hashCode());
            System.out.println(quantumField.science + " = " + quantumField.hashCode());
        }

//        //quantumFields.containsKey();
//        Set<QuantumFields> keySet = quantumFields.keySet();
//
//        for (Iterator<QuantumFields> it = keySet.iterator(); it.hasNext(); ) {
//            QuantumFields quantumFields1 = it.next();
//            System.out.println(quantumFields1);
//            System.out.println(quantumFields.get(quantumFields1));
//            System.out.println(quantumFields.containsKey(quantumFields1));
//        }


//        //quantumFields.entrySet();
//        Set<Map.Entry<QuantumFields, Integer>> entrySet = quantumFields.entrySet();
//
//        for (Iterator<Map.Entry<QuantumFields, Integer>> it = entrySet.iterator(); it.hasNext(); ) {
//            System.out.println(it.next());
//        }


        //quantumFields.putAll();
        Map<QuantumFields, Integer> newQuantumFields = new HashMap<QuantumFields, Integer>();
        List<Integer> newHashcodes = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            QuantumFields o = QuantumFields.getInstanceOf();
            newQuantumFields.put(o,o.hashCode());
            newHashcodes.add(o.hashCode());
            System.out.println(o.hashCode());
        }
        quantumFields.putAll(newQuantumFields);
        System.out.println(quantumFields);


        Set<QuantumFields> keySet2 = quantumFields.keySet();
        List<Integer> allHashcodes = new ArrayList<Integer>();

        for (Iterator<QuantumFields> it = keySet2.iterator(); it.hasNext(); ) {
            QuantumFields quantumFields1 = it.next();
            allHashcodes.add(quantumFields1.hashCode());
        }


//        //quantumFields.remove();
//        for (Integer i:newHashcodes) {
//            quantumFields.values().remove(i);
//        }
//        System.out.println(quantumFields);

        System.out.println(quantumFields.values().removeAll(allHashcodes.subList(1,3)));
        System.out.println(quantumFields.values().retainAll(allHashcodes.subList(1,3)));

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
        Scanner in = new Scanner(System.in);
        QuantumFields q = new QuantumFields();
        System.out.println("Введите науку: ");
        q.setScience(in.nextLine());
        System.out.println("Введите порядковый номер: ");
        q.setOrdinal(in.nextInt());
//        System.out.println("Имеется ли математическое описание: ");
//        if (in.nextLine() == "Да") {
//            q.mathDescription = true;
//        }
//        q.mathDescription = false;
        return q;
    }

    public void printSentence(){
        System.out.println("This is a Quantum Field.");
    }
}
