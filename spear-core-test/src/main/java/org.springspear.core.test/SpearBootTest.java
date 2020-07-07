/**
 * Copyright (c) 2020-2030, Zhiqiangc 程志强 (zhiqiangc1991@outlook.com).
 * <p>
 */
package org.springspear.core.test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @Author     ：Zhiqiangc.
 * @ Date       ：Created in 16:30 2020/7/7
 * @ Description：简化测试
 * @ Modified By：
 * @Version: 1.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootTest
public @interface SpearBootTest {
    @AliasFor("appName")
    String value() default "spear-test";

    /**
     * 服务名：appName
     * @return appName
     */
    @AliasFor("value")
    String appName() default "ndwp-test";
    /**
     * profile
     * @return profile
     */
    String profile() default "dev";
    /**
     * 启用 ServiceLoader 加载 starterService
     * @return 是否启用
     */
    boolean enableLoader() default false;
}
