package ru.lanit.factory;

public interface Visitor {
    void visit (ParamMatrix firstOperand);
    void visit (Matrix firstOperand);
    MyLong visit (MyLong operand);
    MyDouble visit (MyDouble operand);
}
