
package com.ranjan.javatest;

import java.util.Arrays;
import java.util.List;

public class SysMethodRef1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ranjan", "Chanda", "Ayansh", "Prakash");

		names.forEach((str) -> {
			System.out.print(str + "\t");
		});

		names.forEach(str -> System.out.print(str + "\t"));

	}

}
