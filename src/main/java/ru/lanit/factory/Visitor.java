package ru.lanit.factory;

import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.MultiplicationException;

public interface Visitor {
    void visit (Matrix firstOperand) throws AdditionException, MultiplicationException;
    MyLong visit (MyLong operand);
    MyDouble visit (MyDouble operand);
}
