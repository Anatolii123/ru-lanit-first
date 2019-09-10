package ru.lanit.exceptions;

import ru.lanit.exceptions.MatrixException;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class SidesDifferenceException extends MatrixException {
    private static Logger logger = Logger.getLogger("Sides Difference Exception");
    public SidesDifferenceException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
