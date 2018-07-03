package com.myutils;


public class MyLogger {

    private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getRootLogger();

    public static final void error(String message) {
        logger.error(message);
    }

    public static final void warn(String message) {
        logger.warn(message);
    }

    public static final void info(String message) {
        logger.info(message);
    }

    public static final void debug(String message) {
        logger.debug(message);
    }

    public static void info(float message) {
        logger.info(message);
    }



}

