package com.ciphersnippet.myauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class MyAuthserverApplication {
/*
* to create a private key: openssl genrsa -out jwt.pem 2048
* to fetch this private key: openssl rsa -in jwt.pem
* to fetch the public key: openssl rsa -in jwt.pem -pubout
*============================================================= or
*	openssl genrsa -out config/jwt/private.pem -aes256 4096*
*	openssl rsa -pubout -in config/jwt/private.pem -out config/jwt/public.pem
***/
	public static void main(String[] args) {
		SpringApplication.run(MyAuthserverApplication.class, args);
	}

}
