package com.huawei.cloudconsumerorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CloudConsumerOrder80Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerOrder80Application.class, args);
	}

}
