package ru.lanit.first;

import java.util.Scanner;

public abstract class Matter implements Philosophy { // todo мне не очень нравится, что класс Материя реализует интерфейс Информация. Как-то не очень логично.

    protected String science;
    protected boolean mathDescription;

    protected Matter(){}

    //TODO прошу добавить хотябы один "полезный" метод. Пример - шаблонный метод (см. ссылку)
    public void templateMethod() {
        reason();
        printClass();
        printAncestor();
        printDescendants();
        conclusion();

    }

    public void reason() {
        System.out.println("The reason is the Big explosion");
    }

    public void conclusion() {
        System.out.println("It will end with the Big collapse");
    }

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

