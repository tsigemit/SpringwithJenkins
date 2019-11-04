package com.Spring.SpringTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private  SortAlgorithm sortAlgorithm;



public int binarySearch(int numbers[], int numberToSearch) {
	int[] sortNumbers = sortAlgorithm.sort(numbers);
	System.out.println(sortAlgorithm);
	return 3;
}
}
