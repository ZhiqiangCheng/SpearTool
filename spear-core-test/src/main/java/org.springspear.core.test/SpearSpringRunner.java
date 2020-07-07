/**
 * Copyright (c) 2020-2030, Zhiqiangc 程志强 (zhiqiangc1991@outlook.com).
 * <p>
 */
package org.springspear.core.test;

import org.junit.runners.model.InitializationError;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springspear.core.starter.SpearApplication;
import org.springspear.core.starter.constant.AppConstant;
import org.springspear.core.starter.service.StarterService;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 设置启动参数
 *
 * @ Author     ：Zhiqiangc.
 * @ Date       ：Created in 16:50 2020/7/7
 */
public class SpearSpringRunner extends SpringJUnit4ClassRunner {
    public SpearSpringRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
        setUpTestClass(clazz);

    }
    private void setUpTestClass(Class<?> clazz){
        SpearBootTest spearBootTest = AnnotationUtils.getAnnotation(clazz,SpearBootTest.class);
        if (spearBootTest == null) {
            throw new SpearBootTestException(String.format("%s must be @SpearBootTest .",clazz));
        }
        String appName = spearBootTest.appName();
        String profile = spearBootTest.profile();
        boolean isLocalDev = SpearApplication.isLocalDev();
        Properties props = System.getProperties();
        props.setProperty("ndwp.env", profile);
        props.setProperty("ndwp.name", appName);
        props.setProperty("ndwp.is-local", String.valueOf(isLocalDev));
        props.setProperty("ndwp.dev-mode", profile.equals(AppConstant.PROD_CODE) ? "false" : "true");
        props.setProperty("ndwp.service.version", AppConstant.APPLICATION_VERSION);
        props.setProperty("spring.application.name", appName);
        props.setProperty("spring.profiles.active", profile);
        props.setProperty("info.version", AppConstant.APPLICATION_VERSION);
        props.setProperty("info.desc", appName);
        props.setProperty("spring.main.allow-bean-definition-overriding", "true");
        // 加载自定义组件
        if (spearBootTest.enableLoader()) {
            List<StarterService> launcherList = new ArrayList<>();
            SpringApplicationBuilder builder = new SpringApplicationBuilder(clazz);
            ServiceLoader.load(StarterService.class).forEach(launcherList::add);
            launcherList.stream().sorted(Comparator.comparing(StarterService::getOrder)).collect(Collectors.toList())
                    .forEach(launcherService -> launcherService.starter(builder, appName, profile));
        }
        System.err.println(String.format("---[junit.test]:[%s]---启动中，读取到的环境变量:[%s]", appName, profile));
    }
}
