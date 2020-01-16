package com.weichuang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;

@SpringBootApplication//分布式事务后，这个必须包含，不然就无法找到事务管理 (exclude = {DataSourceAutoConfiguration.class})
@SpringCloudApplication
@EnableFeignClients
@ComponentScan("com.weichuang.demo")
@EnableZuulProxy
@EnableDistributedTransaction//启动分布式管理事务
public class SpringbootDemoApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApp.class, args); 
	}

}