package org.springspear.core.starter.config;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springspear.core.starter.SpearApplication;

/**
 * 配置类
 *
 * @author Zhiqiangc
 */
@Configuration
@AllArgsConstructor
@Order(Ordered.HIGHEST_PRECEDENCE)
@EnableConfigurationProperties({
        SpearApplication.class
})
public class SpearStarterConfiguration {
}
