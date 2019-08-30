package ru.lanit.second;

import ru.lanit.first.*;

import java.util.Collections;
import java.util.ArrayList;
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
//        List<Integer> list2 = Collections.unmodifiableList(new ArrayList<Integer>() {
//            {
//                add(2);
//                add(3);
//                add(5);
//                add(7);
//            }
//        });
//
//        System.out.println(list2);

        //Substance s = new Substance();
        //Matter s = Matter.getInstanceOf();


        /**
         * Внутренний класс
         */
        BaryonicMatter b = BaryonicMatter.getInstanceOf();
        BaryonicMatter.BaryonicMatter3 b3 = b.new BaryonicMatter3();

        /**
         * Вложенный класс
         */
        BaryonicMatter.BaryonicMatter2 b2 = new BaryonicMatter.BaryonicMatter2();

        Substance.halfLife hal = Substance.getInstanceOfInner();
        hal.setH(234L);
        System.out.println(hal.getH());

    }
}
