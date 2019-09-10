package ru.lanit.exceptions;

import ru.lanit.exceptions.ArgumentsException;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class IncorrectRowsCountException extends ArgumentsException {
    private static Logger logger = Logger.getLogger("Incorrect Rows Count Exception");
    public IncorrectRowsCountException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
