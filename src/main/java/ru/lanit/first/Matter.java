package ru.lanit.first;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public abstract class Matter implements Philosophy, HasOrdinal { // todo мне не очень нравится, что класс Материя реализует интерфейс Информация. Как-то не очень логично.

    protected String science;
    protected boolean mathDescription;
    protected Integer ordinal;

    protected Matter(){}

    @Override
    public int hashCode() {
        int val = this.mathDescription ? 1 : 0;
        int[] h = {this.getOrdinal(), this.getScience().hashCode(), val};
        return Arrays.hashCode(h);
    }

    @Override
    public boolean equals(Object o) {
        //TODO если пришёл null - возвращаем false
        //TODO Если пришёл объект другого класса - возвращем false (instanceof)
        if (o == null || !(o instanceof Matter)) {
            return false;
        }
        //Если пришло то, что нужно, то приводим o к типу Matter и работаем с приведённой сущностью.
        //Воспользоваться полиморфизмом и наследованием
        Matter that = (Matter) o;
        boolean a = this.hashCode() == o.hashCode()
                && that.mathDescription == this.mathDescription
                && that.science.equals(this.science)
                && that.ordinal.equals(ordinal);
        return a;
    }

    /**
     * Если поле science не заполнено, заполняем значением по умолчанию ("шаблонный метод")
     *
     * @return сохранённое значение поля science
     */
    public String getScience() {
        if (science == null) {
            setScience("");
        }
        return science;
    }

    /**
     * Задаём полю this.science значение по умолчанию
     */
    public void setScience(String science) {
        this.science = science;
    }


//    public abstract void setScience();

    public boolean getMathDescription() {
        return mathDescription;
    }

    public void setMathDescription(boolean mathDescription){
        this.mathDescription = mathDescription;
    };

    public Integer getOrdinal() {
        if(ordinal == null){
            setOrdinal(0);
        }
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }


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

