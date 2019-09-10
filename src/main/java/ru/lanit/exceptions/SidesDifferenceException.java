package ru.lanit.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Класс используется для вызова исключения при невыполнении условий сложения и умножения матриц:
 * 1) При сложении матриц исключение вызывается в случае неравенства размерностей слагаемых
 * 2) При умножении матриц исключение вызывается в случае несогласованности матриц
 */
public class SidesDifferenceException extends MatrixException {
    private static Logger logger = Logger.getLogger("Sides Difference Exception");
    public SidesDifferenceException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
