package com.sp.springannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Primary
public class snapdragon implements MobileProcessor {

	public void processor() {
		
		System.out.println("best CPU");

	}

}
