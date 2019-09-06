package ru.lanit.factory;

public class ParameterizationClass<T extends HasValue, VAL extends Number> implements Operations {
    private Class<T> resultType;
    private VAL value;

    public ParameterizationClass(Class<T> clazz, VAL value) {
        this.resultType = clazz;
        this.value = value;
    }

    public Operations add(Operations operations) {
            if(!(operations instanceof ParameterizationClass)){
            throw new ArithmeticException("Operation is not defined");
        }
        ParameterizationClass that = (ParameterizationClass) operations;
        ParameterizationClass result = new ParameterizationClass( new MyLong(),5);
        result.value = (Integer) value +(Integer) that.value;
        return result;
    }

    public Operations sub(Operations operations) {
        if(!(operations instanceof T)){
            throw new ArithmeticException("Operation is not possible");
        }
        T that = (T) operations;
        T result = new T();
        return result;
    }

    public Operations mult(Operations operations) {
        if(!(operations instanceof T)){
            throw new ArithmeticException("Operation is not possible");
        }
        T that = (T) operations;
        T result = new T(this.value * that.value);
        return result;
    }

    public T accept(Visitor visitor) {
        return visitor.visit(T);
    }
}
