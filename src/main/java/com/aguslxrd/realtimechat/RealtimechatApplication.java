package com.aguslxrd.realtimechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RealtimechatApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealtimechatApplication.class, args);
	}


	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**") // Allow CORS for all paths
						.allowedOrigins("http://localhost:4200")
						.allowedMethods("*")
						.allowedHeaders("*")
						.exposedHeaders("Authorization", "Bearer")
						.allowCredentials(true);
			}
		};
	}
}