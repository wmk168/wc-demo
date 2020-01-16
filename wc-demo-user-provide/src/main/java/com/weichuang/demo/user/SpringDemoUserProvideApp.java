package com.weichuang.demo.user;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.alibaba.druid.pool.DruidDataSource;
import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;

import tk.mybatis.spring.annotation.MapperScan;


//新版本springcloud后，如果在mvn配置文件里面引入了spring-cloud-starter-netflix-eureka-server， 可以不使用如下注解，因为这个包已包含了
@SpringCloudApplication//这个注解包含了下面三个注解

//@EnableDiscoveryClient//可以是其他注册中心,如zk,Consul等,配置了这个就
//@EnableEurekaClient//只能支持Eureka注册中心
//@EnableCircuitBreaker//断容

@EnableWebMvc
@ComponentScan(value = "com.weichuang.demo")
@EnableFeignClients("com.weichuang.demo.*.api")
@EnableCaching
@MapperScan(basePackages = "com.weichuang.demo.*.dao")
@EnableDistributedTransaction//启动分布式事务管理，codeing这个关闭管理中心后，再启动，客户端就无法再重置连接，估计是系统还是有bug了，待分析研究
public class SpringDemoUserProvideApp{

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoUserProvideApp.class, args);
	}
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource dataSource(){//分布式事务， 必须实例化后，不报错了，有点坑爹啊
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));//用户名
		dataSource.setPassword(env.getProperty("spring.datasource.password"));//密码
		dataSource.setInitialSize(2);
		dataSource.setMaxActive(20);
		dataSource.setMinIdle(0);
		dataSource.setMaxWait(60000);
		dataSource.setValidationQuery("SELECT 1");
		dataSource.setTestOnBorrow(false);
		dataSource.setTestWhileIdle(true);
		dataSource.setPoolPreparedStatements(false);
		return dataSource;
	} 

}
