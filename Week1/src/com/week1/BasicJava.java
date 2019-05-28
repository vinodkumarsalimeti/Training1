package com.week1;

public class BasicJava {

	public void check1() {
		System.out.println("Checking1");
		System.out.println("Checking12");
		System.out.println("Checking123");
		System.out.println("Checking1234");
		System.out.println("Checking12345");
	}

	public void check2() {
		System.out.println("h1");
		System.out.println("h12");

		check1();

		System.out.println("h123");
		System.out.println("h1234");
		System.out.println("h12345");

	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		BasicJava bj = new BasicJava();
		bj.check2();
	}

}
