package com.weichuang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.weichuang.demo.*.dao")
//新版本springcloud后，如果在mvn配置文件里面引入了spring-cloud-starter-netflix-eureka-server， 可以不使用如下注解，因为这个包已包含了
@SpringCloudApplication//这个注解包含了下面三个注解
public class SpringDemoOrderApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoOrderApp.class, args);
	}
}
