package com.Spring.SpringTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binrarySearch = new BinarySearchImpl(new QuickSort());
		ApplicationContext applicationContext =SpringApplication.run(SpringTutorialApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch.binarySearch(new int[] {12,4,6}, 6));
	}

}
