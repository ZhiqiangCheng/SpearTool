package org.springspear.core.starter.constant;

/**
 * Token配置常量.
 *
 * @author Zhiqiangc
 */
public interface TokenConstant {
    String SIGN_KEY = "Ndwp";
    String AVATAR = "avatar";
    String HEADER = "ndwp-auth";
    String BEARER = "Bearer ";
    String ACCESS_TOKEN = "access_token";
    String REFRESH_TOKEN = "refresh_token";
    String TOKEN_TYPE = "token_type";
    String EXPIRES_IN = "expires_in";
    String ACCOUNT = "account";
    String USER_ID = "user_id";
    String ROLE_ID = "role_id";
    String USER_NAME = "user_name";
    String ROLE_NAME = "role_name";
    String TENANT_ID = "tenant_id";
    String CLIENT_ID = "client_id";
    String LICENSE = "license";
    String LICENSE_NAME = "powered by ndwp";
    String DEFAULT_AVATAR = ""; // 默认图片
    Integer AUTH_LENGTH = 7;
}
