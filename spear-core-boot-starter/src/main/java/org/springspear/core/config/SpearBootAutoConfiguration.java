/**
 * Copyright (c) 2020-2030, Zhiqiangc 程志强 (zhiqiangc1991@outlook.com).
 * <p>
 */
package org.springspear.core.config;

/**
 * 配置类
 *
 * @ Author     ：Zhiqiangc.
 * @ Date       ：Created in 18:07 2020/7/7
 */

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springspear.core.starter.props.SpearProperties;
@Slf4j
@Configuration
@EnableConfigurationProperties({
        SpearProperties.class
})
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@AllArgsConstructor
public class SpearBootAutoConfiguration {
    private SpearProperties spearProperties;
}
