package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		// TODO 정열되었다고 가정 
		return numbers;
	}

}
