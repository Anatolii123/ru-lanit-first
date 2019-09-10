package ru.lanit.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Класс используется для вызова исключения при невыполнении условия умножения матриц,
 * а именно согласованности матриц
 */
public class MultiplicationException extends SidesDifferenceException {
    private static Logger logger = Logger.getLogger("Multiplication Exception");

    public MultiplicationException(String s) {
        System.out.println(s);
    }
    public MultiplicationException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
