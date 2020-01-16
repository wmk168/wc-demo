package com.weichuang.demo;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringCloudApplication
@RestController
@EnableZuulProxy
public class SpringDemoZuulApp {
	public static void main(String[] args) {
		//SpringApplication.run(SpringDemoZuulApp.class, args);
		HttpClient httpClient= HttpClients.createDefault();
		HttpGet httpGet=new HttpGet("https://haokan.baidu.com/v?vid=9594749321944247055&pd=bjh&fr=bjhauthor&type=video");
		httpGet.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36 Edge/18.18362");
		try {
			HttpEntity httpEntity= httpClient.execute(httpGet).getEntity();
			String result = EntityUtils.toString(httpEntity, "utf-8");
			System.out.println(result);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/zipkin/get")
	public Object getById() {
		return restTemplate.getForObject("http://127.0.0.1:5555/user/getById?id=1", Object.class);
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
