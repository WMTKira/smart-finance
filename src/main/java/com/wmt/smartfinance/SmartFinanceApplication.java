package com.wmt.smartfinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wmtumanday
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SmartFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartFinanceApplication.class, args);
	}


}
