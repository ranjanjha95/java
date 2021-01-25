package com.ranjan.java8.lambda.methodreference;

interface MethodReference {

	void helloMethodReference();

	// 1. Can not be more than one method
	// void helloMethodReference();

	// 2. Arguments should be same as of helloMethodReference
	// void helloMethodReference(int a);

	// 3. Return type can be different
	// int helloMethodReference();

	// 4. Method name can be different
	// int helloMethodReference_1();
}

public class StaticMethodReferenceDemo {
	static void helloMethodReference() {
		System.out.println("From helloMethodReference!");

	}

	public static void main(String args[]) {
		MethodReference methodReference = StaticMethodReferenceDemo::helloMethodReference;
		methodReference.helloMethodReference();
	}
}
