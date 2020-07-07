package org.springspear;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springspear.core.constant.StarterConstant;
import org.springspear.core.starter.SpearApplication;

/**
 * 启动器
 *
 * @author Zhiqiangc
 */
@EnableScheduling
@SpringBootApplication
public class Application {
    public static void main( String[] args ) {
        SpearApplication.run(StarterConstant.APPLICATION_NAME, Application.class, args);
    }
}
