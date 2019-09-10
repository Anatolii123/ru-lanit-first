package ru.lanit.exceptions;

import ru.lanit.exceptions.ArgumentsException;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Класс используется для вызова исключения при введении недопустимого значения числа строк матрицы (-1, -2 и т.д.)
 */
public class IncorrectRowsCountException extends ArgumentsException {
    private static Logger logger = Logger.getLogger("Incorrect Rows Count Exception");

    public IncorrectRowsCountException(String s) {
        System.out.println(s);
    }
    public IncorrectRowsCountException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
