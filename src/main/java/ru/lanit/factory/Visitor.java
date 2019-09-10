package ru.lanit.factory;

import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.MultiplicationException;
import ru.lanit.exceptions.SidesDifferenceException;

public interface Visitor {
    void visit (Matrix firstOperand) throws SidesDifferenceException;
    MyLong visit (MyLong operand);
    MyDouble visit (MyDouble operand);
}
