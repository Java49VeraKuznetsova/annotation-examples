package telran.annotation.examples;

import telran.test.annotation.BeforeEach;
import telran.test.annotation.Test;

public class TestClass {
	@BeforeEach
	void testBeforeEach ()
	{
		fBeforeEach();
		System.out.println("Hi, I'm before each test1");
	}
	private void f1(int b) { 
		System.out.println("test f1 passed " + b);
	}
	private void f1() {
		System.out.println("test f1 failed ");
	}
	
	private void fBeforeEach() {
		System.out.println("Hi, I'm before each test2");
	}
	/*
	@Test
	void test2() {
		fBeforeEach();
	}
	*/
	
	
	
	@Test
	void test1() {
		f1(10);
	}
	@Test
	void test() {
		f1();
	}
	
}