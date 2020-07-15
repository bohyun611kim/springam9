package com.in28minutes.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class,args);
		// singleton 
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(">>> " + binarySearch);
		System.out.println(">>> " + binarySearch2);
		
		int result = binarySearch.binarySearch(new int[] { 24, 4, 6 }, 3);
		System.out.println(">>>" + result);
	}

}
