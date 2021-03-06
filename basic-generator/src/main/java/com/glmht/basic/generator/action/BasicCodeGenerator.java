package com.glmht.basic.generator.action;


import com.glmht.basic.generator.action.config.BasicGeneratorConfig;

/**
 * 代码生成器,可以生成实体,dao,service,controller,html,js
 *
 * @author mht
 * @Date 2017/5/21 12:38
 */
public class BasicCodeGenerator {

    public static void main(String[] args) {

        /**
         * Mybatis-Plus的代码生成器:
         *      mp的代码生成器可以生成实体,mapper,mapper对应的xml,service
         */
        BasicGeneratorConfig basicGeneratorConfig = new BasicGeneratorConfig();
        basicGeneratorConfig.doMpGeneration();

        /**
         * basic的生成器:
         *      basic的代码生成器可以生成controller,html页面,页面对应的js
         */
        basicGeneratorConfig.doBasicGeneration();
    }

}