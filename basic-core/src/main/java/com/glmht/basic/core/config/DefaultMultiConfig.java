package com.glmht.basic.core.config;

import com.glmht.basic.core.mutidatasource.aop.MultiSourceExAop;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 多数据源配置
 *
 * @author mht
 * @Date 2017/5/20 21:58
 */
@Configuration
@ConditionalOnProperty(prefix = "basic", name = "muti-datasource-open", havingValue = "true")
public class DefaultMultiConfig {

    @Bean
    public MultiSourceExAop multiSourceExAop() {
        return new MultiSourceExAop();
    }
}
