package com.cxf.log.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chenxiaofeng
 * @version 1.0
 * @created 18/9/2.
 */
public class LogDemo {
    public static final Logger logger = LoggerFactory.getLogger(LogDemo.class);

    public static void main(String[] args) {
        logger.error("error");
        logger.debug("debug");
        logger.info("info");
        logger.trace("trace");
        logger.warn("warn");
        logger.error("error {}", "param");
    }

}
