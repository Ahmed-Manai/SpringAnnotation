package com.sp.springannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Bionic implements MobileProcessor {

	public void processor() {
		System.out.println("second best cpu");

	}

}
