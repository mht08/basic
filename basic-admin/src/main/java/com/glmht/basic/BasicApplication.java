package com.glmht.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot方式启动类
 *
 * @author mht
 * @Date 2017/5/21 12:06
 */
@SpringBootApplication
public class BasicApplication {

    private final static Logger logger = LoggerFactory.getLogger(BasicApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
        logger.info("BasicApplication is success!");
    }
}
