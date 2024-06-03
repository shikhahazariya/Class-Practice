package example;

import java.util.Scanner;

public class demo2 {
	public static int findtheeven(int num) {
		num=num+20;
		return num;
	}
 public static void main(String args[]) {
	 //creating Scanner class object
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 //reading value from user
	 int b=sc.nextInt();
	 //calling method 
	 int a=findtheeven(b);
	 System.out.print("Value of a "+a);
 }
}
  