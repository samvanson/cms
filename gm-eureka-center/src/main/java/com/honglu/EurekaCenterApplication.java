package com.honglu;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableEurekaServer
@Configuration
@EnableApolloConfig({"application"})
public class EurekaCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCenterApplication.class, args);
	}
}
