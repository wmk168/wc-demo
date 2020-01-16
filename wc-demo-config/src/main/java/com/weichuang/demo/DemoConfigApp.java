package com.weichuang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class DemoConfigApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(DemoConfigApp.class, args);
    }
}
