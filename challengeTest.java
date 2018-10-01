package com.dev.challenge;

import java.util.Scanner;

public class challengeTest {

	public static void main(String[] args) {

		challenge c=new challenge();
		System.out.println("Enter your fisrt number ! :");
		Scanner sc = new Scanner (System.in);     
	    int num1 = sc.nextInt();
	    System.out.println("Enter your second number ! :");
	    int num2 = sc.nextInt();
	    System.out.println("The list of number between :"+num1+" and "+num2+" are : ");
		c.displayMagicalNumber(num1,num2);
	}

}
