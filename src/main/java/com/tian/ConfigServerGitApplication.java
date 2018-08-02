package com.tian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @EnableConfigServer 注解, 用来启用spring-config的配置中心功能.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerGitApplication {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(Application.class).web(true).run(args);
		SpringApplication.run(ConfigServerGitApplication.class, args);
	}
}
