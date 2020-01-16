package com.weichuang.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//配置spring，注册服务中心 
@EnableEurekaServer
@SpringBootApplication//(exclude = {SecurityAutoConfiguration.class })//SecurityAutoConfiguration排除无效果，只能在mvn里面注释掉引用
public class SpringCloudDemoEurekaApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoEurekaApp.class, args);
	}

}
