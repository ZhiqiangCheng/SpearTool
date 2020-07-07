package org.springspear.core.starter.constant;

/**
 * 系统常量.
 *
 * @author Zhiqiangc
 */
public interface AppConstant {
    /**
     * 应用版本
     */
    String APPLICATION_VERSION = "1.0";

    /**
     * 基础包
     */
    String BASE_PACKAGES = "org.springspear";

    /**
     * 应用名前缀
     */
    String APPLICATION_NAME_PREFIX = "spear-";

    /**
     * 测试模块名称
     */
    String APPLICATION_TEST_NAME = APPLICATION_NAME_PREFIX + "test";

    /**
     * 开发环境
     */
    String DEV_CODE = "dev";
    /**
     * 生产环境
     */
    String PROD_CODE = "prod";
    /**
     * 测试环境
     */
    String TEST_CODE = "test";

    /**
     * 代码部署于 linux 上，工作默认为 mac 和 Windows
     */
    String OS_NAME_LINUX = "LINUX";
}
