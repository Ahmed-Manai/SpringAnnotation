package com.sp.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sony {
	
	@Autowired
	@Qualifier("bionic") 
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("sony z5, 3gb ram, and 21mb camera");
		cpu.processor();
	}
}
