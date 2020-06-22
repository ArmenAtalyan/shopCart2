package com.demo.shopCart.jwt;

final class JwtStaticContent {

    private JwtStaticContent() {}

    static final String SECRET = "SecretKeyForGeneratingJWTToken";
    static final long EXPIRATION_TIME = 864_000_000; //10 days
    static final String TOKEN_PREFIX = "Bearer ";
    static final String HEADER = "Authorization";

}
