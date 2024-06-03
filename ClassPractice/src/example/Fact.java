package example;

import java.util.Scanner;

public class Fact {
	int result;
	public Fact(int a) {
		// TODO Auto-generated constructor stub
	}
	int fact(int f) {
		if(f==1)
			return 1;
		if(f>0)
			result=fact(f-1)*f;
		return result;
		
	}

}
class Factorial{
	public static void main(String args[]) {
		int a;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		Fact f=new Fact(a);
		System.out.println("Factorial of given number "+f.fact(a));
	}
}
