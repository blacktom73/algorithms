package main.java.hu.mitro.recursion;

public class FibonacciRecursion {

	public static int fibonacciRecursion(int number) {
		if (number <= 1) {
			return 1;
		} else {
			return fibonacciRecursion(number - 2) + fibonacciRecursion(number - 1);
		}
	}

	public static void main(String[] args) {
		int number = 5;
		System.out.println("Fibonacci's " + number + ". number = " + fibonacciRecursion(number));
	}

}
