package com.epam.SimpleCalculator;
import java.util.*;

import java.util.Scanner;



public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first value: ");
		double x = sc.nextDouble();
		System.out.println("enter the second value: ");
		double y = sc.nextDouble();
		
		CalcMethods method = new CalcMethods();
		double result;
		boolean choose = true;
		char another;
		while(choose) {
			
		System.out.println("Select operations from below\n1. Addition(+)\n2. Substraction(-)\n3. Multiplication(*)\n4. Division(/)\n5. Modulus(%)");
		try {
			switch(sc.next().charAt(0)) {
			case '1':
				result = method.addition(x, y);
				System.out.println(x+" + "+y+ "= "+result+"\nDo you want to perform any other operation(y/n)?");
				another = sc.next().charAt(0);
				if(another == 'y'|| another == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
					
				}
			case '2':
				result = method.subtract(x, y);
				System.out.println(x+" - "+y+ "= "+result+"\nDo you want to perform any other operation(y/n)?");
				another = sc.next().charAt(0);
				if(another == 'y'|| another == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
					
				
			}
			case '3':
				result = method.multiply(x, y);
				System.out.println(x+" * "+y+ "= "+result+"\nDo you want to perform any other operation(y/n)?");
				another = sc.next().charAt(0);
				if(another == 'y'|| another == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
					
				}
			case '4':
				result = method.division(x, y);
				System.out.println(x+" / "+y+ "= "+result+"\nDo you want to perform any other operation(y/n)?");
				another = sc.next().charAt(0);
				if(another == 'y'|| another == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
					
				}
			case '5':
				result = method.modulus(x, y);
				System.out.println(x+" % "+y+ "= "+result+"\nDo you want to perform any other operation(y/n)?");
				another = sc.next().charAt(0);
				if(another == 'y'|| another == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
				}
				default :
					System.out.println("Please select from the operations mentioned above..");
			}
		}catch(Exception e) {
			System.out.println("Invalid selection!!!!!");
		}
	}
}
}
