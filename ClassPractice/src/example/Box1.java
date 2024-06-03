package example;

import java.util.Scanner;

public class Box1 {
	public int a;
	public  Box1(int a) {
		this.a=a;
	}
	

}
class test{
	public static void main(String args[]) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		a=sc.nextInt();
		Box1 ob=new Box1(a);
		System.out.println("Value of a "+a);
		
	}
}
