package com.springmvc.test;

public class Test {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < 1000; i++) {
			System.out.println("wahaha"+i);
		}

		long end = System.currentTimeMillis();

		System.out.println("This cost " +(end - start));

		
	}

}
