package example;

import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print("Value of a "+ a);
	}

}
