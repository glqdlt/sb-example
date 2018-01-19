package com.alticast.voo.ui;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:config.properties")
@SpringBootApplication
public class UiApplication implements CommandLineRunner{

	@Value("${def.user.id}")
	private String defaultUserId;

	@Value("${def.user.pw")
	private String defaultUserPw;

	public static void main(String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
