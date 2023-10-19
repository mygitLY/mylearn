package com.liuy.sgg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动类
  */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SggApplication {

	public static void main(String[] args) {
		SpringApplication.run(SggApplication.class, args);
	}

}
