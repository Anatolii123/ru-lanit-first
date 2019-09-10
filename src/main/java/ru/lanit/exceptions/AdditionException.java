package ru.lanit.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Класс используется для вызова исключения при невыполнении условия сложения матриц,
 * а именно равенства размерностей слагаемых
 */
public class AdditionException extends SidesDifferenceException {
    private static Logger logger = Logger.getLogger("Addition Exception");

    public AdditionException(String s) {
        System.out.println(s);
    }
    public AdditionException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
