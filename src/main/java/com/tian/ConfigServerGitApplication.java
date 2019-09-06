package com.tian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableConfigServer 注解, 用来启用spring-config的配置中心功能.
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigServerGitApplication {
	/**
	 * 在git上创建的文件名
	 * 服务名-环境.yml 或者 服务名-环境.properties
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerGitApplication.class, args);
	}
}
