package com.weichuang.demo.eureka.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WebSecurityConfig {
	/*
    @EnableWebSecurity
    public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
        	//配置这个后
            //http.authorizeRequests().anyRequest().authenticated().and().httpBasic().and().csrf().disable();
        	 http.csrf().disable(); //关闭csrf攻击，这样才能注册进入这个
             super.configure(http); //开启认证
        }
    }*/
}
