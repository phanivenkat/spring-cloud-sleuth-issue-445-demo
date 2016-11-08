package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudSleuthIssue445DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSleuthIssue445DemoApplication.class, args);
	}

	@Bean
	ExtendedExecutor executorService() {
		return new ExtendedExecutor() {

			@Override
			public void execute(Runnable runnable) {

			}
		};
	}
}
