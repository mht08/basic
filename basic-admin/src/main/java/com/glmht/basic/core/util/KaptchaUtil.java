package com.glmht.basic.core.util;

import com.glmht.basic.config.properties.BasicProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(BasicProperties.class).getKaptchaOpen();
    }
}