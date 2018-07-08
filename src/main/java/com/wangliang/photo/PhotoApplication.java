package com.wangliang.photo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangliang
 */
@SpringBootApplication
@MapperScan("com.wangliang.photo.dao")
public class PhotoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoApplication.class, args);
	}
}
