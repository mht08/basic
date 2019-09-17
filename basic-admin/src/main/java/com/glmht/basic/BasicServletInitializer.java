package com.glmht.basic;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Basic Web程序启动类
 *
 * @author mht
 * @date 2017-05-21 9:43
 */
public class BasicServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BasicApplication.class);
    }
}
