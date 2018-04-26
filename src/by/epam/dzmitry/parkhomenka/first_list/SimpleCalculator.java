package by.epam.dzmitry.parkhomenka.first_list;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		// initializing variables
		double x = 0; // first number
		double y = 0; // second number
		double sum = 0; // sum result
		double dif = 0; // subtraction result
		double mul = 0; // multiply result
		double div = 0; // division result
		String mathOp = null; // user input for math operation

		// creating scanner object to read user values to variables from console
		Scanner sc = new Scanner(System.in);

		// greetings message
		System.out.println(
				"Hello. This is basic calculator. Enter 'x' and 'y' and enter operation - addition(+), subtraction(-), multiplication(*) and division(/)");
		System.out.println();

		// reading x int value from console input
		System.out.println("Enter x - ");
		while (!sc.hasNextDouble()) {
			System.out.println("Please, enter valid int value");
			sc.next();
		}
		x = sc.nextInt();

		// reading y value from console input
		System.out.println("Enter y - ");
		while (!sc.hasNextDouble()) {
			System.out.println("Please, enter valid int value");
			sc.next();
		}
		y = sc.nextInt();

		// one more scanner to read line
		Scanner scline = new Scanner(System.in);

		// reading math operation from console
		System.out.println("Enter math operation you would like to perform - (+) (-) (*) (/)");
		mathOp = scline.nextLine();

		// switch for math functions
		switch (mathOp) {
		case "+":
			sum = x + y;
			System.out.println(x + " + " + y + " = " + sum);
			break;
		case "-":
			dif = x - y;
			System.out.println(x + " - " + y + " = " + dif);
			break;
		case "*":
			mul = x * y;
			System.out.println(x + " * " + y + " = " + mul);
			break;
		case "/":
			div = x / y;
			System.out.println(x + " / " + y + " = " + div);
			break;
		default:
			System.out.println("Invalid operation. Start calculator again");
			break;
		}

		sc.close();
		scline.close();
	}
}
