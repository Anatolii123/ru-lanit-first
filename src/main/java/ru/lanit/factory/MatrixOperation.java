package ru.lanit.factory;

import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.MultiplicationException;

public interface MatrixOperation {
    Operations[][] perform(Matrix operand1, Matrix operand2) throws MultiplicationException, AdditionException;
}
