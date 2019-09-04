package ru.lanit.first;

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

    public static void calculate(List<QuantumFields> fields) {
        //TODO прошу реализовать пример HashMap, причём, так, чтобы ключами были экзепляры твоих собственных классов. Для этого нужно выполнить некие предварительные действия над классами. Прочитать в книге (нагуглить), что это зто действия.
        Map<QuantumFields, Integer> quantumFields = getMapByKeys(fields);

        //quantumFields.containsKey();
        keySetManipulation(quantumFields);

        //quantumFields.entrySet();
        entrySetDemonstration(quantumFields);

        //quantumFields.putAll();
        Map<QuantumFields, Integer> newQuantumFields = getNewMap(5);
        quantumFields.putAll(newQuantumFields);
        System.out.println(quantumFields);

        List<Integer> newHashCodes = new ArrayList<Integer>(newQuantumFields.values());

        //Set Methods
        hashSetManipulation(quantumFields);
        List<Integer> allHashcodes = new ArrayList<Integer>(quantumFields.values());
        System.out.println(allHashcodes);

        //todo вынести в отдельные методы. Отладить так, чтобы работало то, что ниже
        //quantumFields.remove();
        Map<QuantumFields, Integer> quantumFields2 = removePairs(quantumFields, newHashCodes);
        System.out.println(quantumFields2);

        //Collection Methods
        System.out.println(removeAllChosenElements(quantumFields, allHashcodes,1,3));

        System.out.println(retainAllChosenElements(quantumFields, allHashcodes,3,6));

        //todo добавить метод "транспонирования" Map<QuantumFields, Integer> -> Map<Integer, QuantumFields>


    }

    /**
     * Метод "транспонирует" задаваемую HashMap и возвращает результат операции в виде нового HashMap
     * @return
     */
    private static Map<Integer, QuantumFields> transposeMap(Map<QuantumFields, Integer>) {

    }


    /**
     * Метод удаляет из элемента HashMap все значения, кроме выбранных, и возвращает результат операции в виде нового HashMap
     * @param quantumFields
     * @param allHashcodes
     */
    private static Map<QuantumFields, Integer> retainAllChosenElements(Map<QuantumFields, Integer> quantumFields, List<Integer> allHashcodes, int start, int stop) {
        Map<QuantumFields, Integer> quantumFields2 = new HashMap<QuantumFields, Integer>();
        quantumFields2.putAll(quantumFields);
        if (quantumFields2.values().containsAll(allHashcodes.subList(start,stop))){
            quantumFields2.values().retainAll(allHashcodes.subList(start,stop));
        }
        return quantumFields2;
    }

    /**
     * Метод удаляет все выбранные пары ключ-значение из элемента HashMap и возвращает результат операции в виде нового HashMap
     * @param quantumFields
     * @param allHashcodes
     */
    private static Map<QuantumFields, Integer> removeAllChosenElements(Map<QuantumFields, Integer> quantumFields, List<Integer> allHashcodes, int start, int stop) {
        Map<QuantumFields, Integer> quantumFields2 = new HashMap<QuantumFields, Integer>();
        quantumFields2.putAll(quantumFields);
        if(quantumFields2.values().containsAll(allHashcodes.subList(start, stop))){
            quantumFields2.values().removeAll(allHashcodes.subList(start, stop));
        }
        return quantumFields2;
    }

    /**
     * Метод удаляет пары ключ-значение из элемента HashMap, задаваемые списком значений, и возвращает результат операции в виде нового HashMap
     * @param quantumFields
     * @param hashCodes
     */
    private static Map<QuantumFields, Integer> removePairs(Map<QuantumFields, Integer> quantumFields, List<Integer> hashCodes) {
        Map<QuantumFields, Integer> quantumFields2 = new HashMap<QuantumFields, Integer>();
        quantumFields2.putAll(quantumFields);
        for (Integer hashCode : hashCodes) {
            quantumFields2.values().remove(hashCode);
        }
        return quantumFields2;
    }

    /**
     * Метод создает множество entrySet элемента quantumFields типа HashMap и выводит в консоль пары ключ - значение
     * @param quantumFields
     */
    private static void entrySetDemonstration(Map<QuantumFields, Integer> quantumFields) {
        Set<Map.Entry<QuantumFields, Integer>> entrySet = quantumFields.entrySet();

        for (Iterator<Map.Entry<QuantumFields, Integer>> it = entrySet.iterator(); it.hasNext(); ) {
            Map.Entry<QuantumFields, Integer> entry = it.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    /**
     * Метод формирует множество keySet элемента quantumFields типа HashMap, а также множество hashSet из значений
     * хэш-кодов, делённых на 4, и выводит множества в консоль
     * @param quantumFields
     */
    private static void hashSetManipulation(Map<QuantumFields, Integer> quantumFields) {
        Set<Integer> hashSet = new HashSet<Integer>();
        Set<QuantumFields> keySet2 = quantumFields.keySet();
        for (Iterator<QuantumFields> it = keySet2.iterator(); it.hasNext(); ) {
            QuantumFields quantumFields1 = it.next();
            hashSet.add(quantumFields1.hashCode() / 4);
        }
        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty());
    }

    /**
     * Метод создает HashMap с задаваемым кол-вом пар ключ - значение и возвращает её
     * @return
     */
    private static Map<QuantumFields, Integer> getNewMap(int amountOfPairs) {
        Map<QuantumFields, Integer> newQuantumFields = new HashMap<QuantumFields, Integer>();
        for (int i = 0; i < amountOfPairs; i++) {
            QuantumFields o = QuantumFields.getInstanceOf();
            newQuantumFields.put(o, o.hashCode());
            System.out.println(o.hashCode());
        }
        return newQuantumFields;
    }

    /**
     * Метод создает keySet задаваемой карты и выводит в консоль результаты манипуляций с ним
     * @param quantumFields
     */
    private static void keySetManipulation(Map<QuantumFields, Integer> quantumFields) {
        Set<QuantumFields> keySet = quantumFields.keySet();

        for (Iterator<QuantumFields> it = keySet.iterator(); it.hasNext(); ) {
            QuantumFields quantumFields1 = it.next();
            System.out.println(quantumFields1);
            System.out.println(quantumFields.get(quantumFields1));
            System.out.println(quantumFields.containsKey(quantumFields1));
        }
    }

    /**
     * Метод создает HashMap по задаваемому списку объектов QuantumFields и возвращает её
     * @param fields
     * @return
     */
    private static Map<QuantumFields, Integer> getMapByKeys(List<QuantumFields> fields) {
        Map<QuantumFields, Integer> quantumFields = new HashMap<QuantumFields, Integer>();

        for (QuantumFields quantumField: fields) {
            quantumFields.put(quantumField,quantumField.hashCode());
            System.out.println(quantumField.science + " = " + quantumField.hashCode());
        }
        return quantumFields;
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
