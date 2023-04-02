package com.RuiLing.TMS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * MSCode的系统管理启动类
 *
 * @版权所有 湖南瑞菱科技有限公司
 */
@SpringBootApplication(scanBasePackages = "com.RuiLing")
@EnableDiscoveryClient
@EnableWebSecurity
@EnableFeignClients(basePackages = { "com.RuiLing" })
@EnableCircuitBreaker
@EnableGlobalMethodSecurity(prePostEnabled = true)
@SuppressWarnings("All")
public class RuiLingCloudTMSApplication  {

	public static void main(String[] args) {
		SpringApplication.run(RuiLingCloudTMSApplication.class);
	}

}
