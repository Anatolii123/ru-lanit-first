package ru.lanit.second;

import ru.lanit.first.*;

import java.util.*;

public class Hello {

    public static void main (String[] args) throws Exception {

        for (Description d: Description.values()) {
            if (d.equals(d)){
                //System.out.println(Description.getBy("physics"));
                //System.out.println(Description.valueOf(d.toString()));
                //System.out.println();
            }
        }
//        System.out.println(Description.getBy("physics"));
//        System.out.println(Description.getBy(10));
//        System.out.println(Description.getBy(false));
//        System.out.println();
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(2);
//        list.add(3);
//        list.add(5);
//        list.add(7);
//        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
//        System.out.println(unmodifiableList);
//
//        System.out.println(list2);

        //Substance s = new Substance();
        //Matter s = Matter.getInstanceOf();

        List<Integer> list2 = Collections.unmodifiableList(
                new ArrayList<Integer>() {
                    {
                        add(2);
                        add(3);
                        add(5);
                        add(7);
                    }
                });
        list2.getClass();
//        /**
//         * Внутренний класс
//         */
//        BaryonicMatter b = BaryonicMatter.getInstanceOf();
//        BaryonicMatter.BaryonicMatter3 b3 = b.new BaryonicMatter3();
//        b3.printSentence();
//        b3.printSentence2();
//
//        /**
//         * Вложенный класс
//         */
//        BaryonicMatter.BaryonicMatter2 b2 = new BaryonicMatter.BaryonicMatter2();
//
//        Substance substance = Substance.getInstanceOf();
//        Substance.HalfLife halfLife = substance.convertToInstanceHalfLive();
//        halfLife.setHalfLife(512L);
//        System.out.println(halfLife.getHalfLife());
//
//        Substance.HalfLife hal = Substance.getInstanceOfInner();
//        hal.setHalfLife(234L);
//        System.out.println(hal.getHalfLife());

//        Field f = Field.getInstanceOf();
//        f.calculate();
//        Substance s = Substance.getInstanceOf();
//        s.calculate();
//        QuantumFields q = QuantumFields.getInstanceOf();
//        q.calculate();

        //TODO сделать так, чтобы в коде использовались коллекции различных типов (Set, List), содержимым которых будут не экземпляры конкретных а классов, а реализации интерфейсов, либо экземпляр абстрактного класса.
        List<HasOrdinal> matters = new ArrayList<HasOrdinal>(); // заполнить экземплярами разных классов потомков
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * 5);
            switch (random) {
                case 0:
                    matters.add(Substance.getInstanceOf());
                    break;
                case 1:
                    matters.add(Field.getInstanceOf());
                    //
                    break;
                case 2:
                    matters.add(QuantumFields.getInstanceOf());
                    break;
                case 3:
                    matters.add(ObscurePhysicalNature.getInstanceOf());
                    break;
                case 4:
                    matters.add(GravitationalField.getInstanceOf());
                    break;
                case 5:
                    matters.add(Antimatter.getInstanceOf());
                    break;
                default:
                    break;
            }
        }

        //TODO для каждого элемента matters вывести результат работы его toString(). Предварительно переопредлить toString()

        for (HasOrdinal m:matters) {
            System.out.println(m.toString());
        }
        System.out.println();

        Collections.sort(matters, new Comparator<HasOrdinal>() {
            public int compare(HasOrdinal o1, HasOrdinal o2) {
                return o1.getOrdinal().compareTo(o2.getOrdinal());
            }
        }); // todo отсортировать по getOrdinal()
        for (HasOrdinal m:matters) {
            System.out.println(m.toString());
        }


        //TODO для каждого элемента matters вывести результат работы его toString(). Предварительно переопредлить toString()

        Set<Physics> physics = new HashSet<Physics>();
        // такое (или наподобие) тоже было бы неплохо
        //TODO хотелось бы видеть не только пример помещения элдеметов в коллекцию и извлечения их оттуда, но и что-то более интересное.


    }
}
