package ru.lanit.factory;

public interface Visitor {
    void visit (Matrix firstOperand) throws AdditionException, MultiplicationException;
    MyLong visit (MyLong operand);
    MyDouble visit (MyDouble operand);
}
