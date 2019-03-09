package main.java.hu.mitro.recursion;

public class FactorialRecursion {

	public static int factorialRecursive(int number){
		if (number == 0){
			return 1;
		} else {
			return number * factorialRecursive(number - 1);
		}
	}

	public static void main(String[] args) {
		int number = 4;
		System.out.println(number + "! = " + factorialRecursive(number));
	}

}
