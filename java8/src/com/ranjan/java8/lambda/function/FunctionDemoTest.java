package com.ranjan.java8.lambda.function;

import java.util.function.Function;

public class FunctionDemoTest {
	public static void main(String args[]) {
		// beforeJava8();// Without Function Functional Interface
		// fromJava8();// With Function Functional Interface

		// andThenTest1();
		andThenTest2();
	}

	private static void andThenTest2() {

		Function<String, String> function1 = str -> (str.toUpperCase());
		Function<String, String> function2 = str -> (str + " World!!");
		Function<String, String> function3 = str -> (str + " function3!!");

		System.out.println(function1.andThen(function2).andThen(function3).apply("Hello"));

	}

	private static void andThenTest1() {

		// fun1 : sum = (num + num)
		// fun2 : sum*sum

		Function<Integer, Integer> function1 = n -> (n + n);
		Function<Integer, Integer> function2 = n -> (n * n);

		Integer result = function1.andThen(function2).apply(10);
		System.out.println(result);

	}

	private static void fromJava8() {

		Double inrRate = 71.0; // Call Webservice
		Function<Integer, Double> function = (a) -> {
			return a * inrRate;
		};

		Integer usd = 10;
		System.out.println("From From Java8 " + usd + " USD = " + function.apply(usd) + " INR");

	}

	// User defined method, this functionality is common in most of the Java
	// application
	private static Double convertUsdToInr(Integer usd) {// Single input

		Double inrRate = 71.0; // Call Webservice
		return usd * inrRate;

	}

	private static void beforeJava8() {

		Integer usd = 10;
		Double inrValue = convertUsdToInr(usd);
		System.out.println("From beforeJava8 " + usd + " USD = " + inrValue + " INR");

	}

}
