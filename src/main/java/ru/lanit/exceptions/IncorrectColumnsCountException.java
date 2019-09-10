package ru.lanit.exceptions;

import ru.lanit.exceptions.ArgumentsException;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Класс используется для вызова исключения при введении недопустимого значения числа столбцов матрицы (-1, -2 и т.д.)
 */
public class IncorrectColumnsCountException extends ArgumentsException {
    private static Logger logger = Logger.getLogger("Incorrect Columns Count Exception");

    public IncorrectColumnsCountException(String s) {
        System.out.println(s);
    }
    public IncorrectColumnsCountException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
