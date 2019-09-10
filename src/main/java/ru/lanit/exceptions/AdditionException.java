package ru.lanit.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

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
