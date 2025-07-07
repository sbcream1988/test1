package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class HelloLombok {
	private final String hello;
	private final int lombok;
	
	public static void main(String args[]) {
		HelloLombok helloLombok = new HelloLombok("임재형", 881101);
		
//		HelloLombok helloLombok = new HelloLombok();
//		helloLombok.setHello("헬로");
//		helloLombok.setLombok(10);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}
}
