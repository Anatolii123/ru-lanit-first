package ru.lanit.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MatrixException extends Exception {
    private static Logger logger = Logger.getLogger("Matrix Exception");

    public MatrixException(String s) {
        System.out.println(s);
    }
    public MatrixException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

}
