package com.projects;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculator ob1 = new Calculator();

		boolean continueLoop=true;
		while(continueLoop) {
			System.out.print("Enter number : ");
			int a = sc.nextInt();
			System.out.print("Enter number : ");
			int b = sc.nextInt();
			
			ob1.show();
			System.out.println("Enter Operation like Number ");
			int operation = sc.nextInt();
			
			if(operation>=6) {
				continueLoop=false;
			}

			switch (operation) {
			case 1: {
				System.out.println("Addition of two numbers " + ob1.addition(a, b));
				break;
			}
			case 2: {
				System.out.println("Substraction of two numbers " + ob1.substraction(a, b));
				break;
			}
			case 3: {
				System.out.println("Multiplication of two numbers " + ob1.multiply(a, b));
				break;
			}
			case 4: {
				System.out.println("Division of two numbers " + ob1.division(a, b));
				break;
			}
			case 5: {
				System.out.println("Modulas of two numbers " + ob1.modulas(a, b));
				break;
			}
			default: {
				System.out.println("Operation not found");
			}
			}
			
			if(operation<=5) {
				System.out.println("If you want to continue the calculation ");
				System.out.println("Type 'YES' for continue and 'NO' for break the calculation");
				sc.nextLine();
				String continues=sc.nextLine();
				if(continues.equalsIgnoreCase("yes")) {
					continueLoop=true;
				}else {
					continueLoop=false;
				}
			}
		}
		sc.close();
	}
	
	void show() {
		System.out.println("Enter Operation like ");
		System.out.println("1 --> Addition");
		System.out.println("2 --> Substraction");
		System.out.println("3 --> Multiplication");
		System.out.println("4 --> Division");
		System.out.println("5 --> Modulas");
		System.out.println("6 --> Exist");
	}

	int addition(int a, int b) {
		return a + b;
	}

	int substraction(int a, int b) {
		return a - b;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int division(int a, int b) {
		return a / b;
	}

	int modulas(int a, int b) {
		return a % b;
	}
}
