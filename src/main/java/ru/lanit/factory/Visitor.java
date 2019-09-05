package ru.lanit.factory;

public interface Visitor {
    void visit (Matrix firstOperand);
    void visit (MyLong operand); // todo добавить в Hello пример использования этого метода
}
