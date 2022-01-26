//Program to print fibonacci series using for loop

//In fibonacci, a number is the sum of previous two numbers.
//Here we do it using Scanner class and user input

import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		int count, num1 = 0, num2 = 1;
		System.out.println("Enter the # you want in sequence: ");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		scanner.close();
		System.out.print("Fibonacci Series of " +count+ " numbers:");
		
		int i=1;
		while(i<count) {
			System.out.print(num1+" ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			i++;
		}
	}
}