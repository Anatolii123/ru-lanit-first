package ru.lanit.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class ArgumentsException extends MatrixException {
    private static Logger logger = Logger.getLogger("Arguments Exception");
    public ArgumentsException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
