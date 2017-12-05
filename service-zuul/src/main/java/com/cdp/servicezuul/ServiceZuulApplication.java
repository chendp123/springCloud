package com.cdp.servicezuul;


import com.cdp.filter.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuulApplication {


	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}

	@Bean
	public MyFilter myFilter(){
		return new MyFilter();
	}
}
