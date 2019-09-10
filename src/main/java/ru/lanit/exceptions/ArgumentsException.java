package ru.lanit.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Класс используется для вызова исключения при неправильном введении параметров матрицы (количества строк и количества столбцов)
 */
public class ArgumentsException extends MatrixException {
    private static Logger logger = Logger.getLogger("Arguments Exception");
    public ArgumentsException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
