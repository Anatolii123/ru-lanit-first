package ru.lanit.first;

import java.util.Collection;
import java.util.Set;

public abstract class Matter implements Philosophy, HasOrdinal { // todo мне не очень нравится, что класс Материя реализует интерфейс Информация. Как-то не очень логично.

    protected String science;
    protected boolean mathDescription;
    protected Integer ordinal;

    protected Matter(){}

    public Integer getOrdinal() {
        if(ordinal == null){
            setOrdinal();
        }
        return ordinal;
    }

    public abstract void setOrdinal();

    //TODO прошу добавить хотябы один "полезный" метод. Пример - шаблонный метод (см. ссылку)
    public void printReasons() {
        checkCalculationError();

        Set<Philosophy> philosophies = calculate(this); // для каждого потомка свой список reasons


        postProcessResult(philosophies);
    }


    public String reason() {
        String result = "The reason is the Big explosion";
        System.out.println(result);
        return result;
    }

    public void conclusion() {
        System.out.println("It will end with the Big collapse");
    }

    protected void checkCalculationError() {
        if(mathDescription){ // если mathDescription, то всё хорошо
            return;
        }

        //Сообщение об ошибке
        throw new RuntimeException("Some error message");
    }

    protected void postProcessResult(Collection<Philosophy> philosophies){
        for (Philosophy philosophy: philosophies) {
            //Вывести reason
        }

    }

    public abstract void printAncestor();
    public abstract void printDescendants();

    public void printClass(){
        System.out.println(getClassName());
    }

    @Override
    public String toString() {
        return getClassName();
    }

    public abstract String getClassName();

    public abstract Set<Philosophy> calculate(Philosophy philosophy);

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

