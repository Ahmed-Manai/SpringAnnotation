package com.sp.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.sp.springannotation")
public class AppConfig 
{
//	@Bean
//	public Sony getPhone() {
//		return new Sony();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new snapdragon();
//	}
}
