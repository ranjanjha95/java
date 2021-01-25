package com.ranjan.javatest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {

		List<Integer> versions = Arrays.asList(1, 2, 3, 4);

		List<Integer> collect = versions.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);

	}

}
