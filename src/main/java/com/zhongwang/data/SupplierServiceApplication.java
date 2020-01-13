package com.zhongwang.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 程序启动入口
 * @author zhangjp
 * created on 2019年2月19日 下午8:21:08
 */
@SpringBootApplication
/*@EnableDiscoveryClient
@EnableFeignClients*/
@EnableScheduling
@MapperScan("com.zhongwang.data.dao")
@EnableTransactionManagement
public class SupplierServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierServiceApplication.class, args);
	}
}
