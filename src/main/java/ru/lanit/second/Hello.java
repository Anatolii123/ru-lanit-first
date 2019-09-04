package ru.lanit.second;

import ru.lanit.first.*;

import java.util.*;

public class Hello {

    public static void main (String[] args) throws Exception {
        Set<QuantumFields> quantumFields = new HashSet<QuantumFields>();
        QuantumFields a = QuantumFields.getInstanceOf();
        QuantumFields b = QuantumFields.getInstanceOf();
        QuantumFields c = QuantumFields.getInstanceOf();
        quantumFields.add(a);
        quantumFields.add(b);
        quantumFields.add(c);

        System.out.println(quantumFields.size());
        System.out.println(quantumFields);
        quantumFields.clear();

        a.setSwitcher(true);

        quantumFields.add(b);
        quantumFields.add(a);
        quantumFields.add(c);
        System.out.println(quantumFields.size());

        List<QuantumFields> quantumFields2 = new ArrayList<QuantumFields>();
        quantumFields2.add(a);
        quantumFields2.add(b);
        quantumFields2.add(c);
        QuantumFields.calculate(quantumFields2);

    }
}
