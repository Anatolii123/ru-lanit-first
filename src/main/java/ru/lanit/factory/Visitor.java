package ru.lanit.factory;

public interface Visitor {
    void visit (Matrix firstOperand);
    MyLong visit (MyLong operand); // todo добавить в Hello пример использования этого метода
    MyDouble visit (MyDouble operand);
}
