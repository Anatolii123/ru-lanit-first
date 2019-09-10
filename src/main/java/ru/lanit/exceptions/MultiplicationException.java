package ru.lanit.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MultiplicationException extends SidesDifferenceException {
    private static Logger logger = Logger.getLogger("Multiplication Exception");
    public MultiplicationException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
