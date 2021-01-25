
package com.ranjan.javatest;

public class SysMethodRef2 {

	public static void main(String[] args) {

		String name = "Ranjan Jha";

		Printer ptr = new Printer();

//		ptr.print(name, new Parser() {
//
//			@Override
//			public String parse(String s) {
//
//				s = s.toUpperCase();
//
//				return s;
//			}
//		});

//		ptr.print(name, (s) -> {
//			s = s.toUpperCase();
//			return s;
//		});

		// ptr.print(name, ParseString::convert);
		// ptr.print(name, ParseString::convert1);
		ParseString parser = new ParseString();
		ptr.print(name, (s -> parser.convertToUpper(s)));
		// ptr.print(name, parser::convertToUpper);

	}

}

class ParseString {

	static String convert(String s) {
		s = s.toUpperCase();
		return s;
	}

	static String convert1(String s) {
		s = s.toLowerCase();
		return s;
	}

	String convertToUpper(String s) {
		s = s.toUpperCase();
		return s;
	}

}

class Printer {

	void print(String s, Parser p) {

		String parsedStr = p.parse(s);

		System.out.println(parsedStr);
	}

}

interface Parser {

	String parse(String s);

}
