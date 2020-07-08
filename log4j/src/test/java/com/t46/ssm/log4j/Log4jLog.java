package com.t46.ssm.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName: Log4jLog
 * @description: TODO
 * @author: PengLiangHu
 * @date: 2020/7/6 14:29
 * @version: 1.0
 */
public class Log4jLog {
    public static void main(String args[]) {
        Logger logger = LogManager.getLogger(Log4jLog.class);
        logger.debug("Debug Level");
        logger.info("Info Level");
        logger.warn("Warn Level");
        logger.error("Error Level");
    }
}
