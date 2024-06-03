package example;

import java.util.Scanner;

public class box3 {
	double l;
	double w;
	double h;
	box3(double l, double w, double h){
		this.l=l;
		this.w=w;
		this.h=h;
	}
  double volume(){
	  return l*w*h;
	 
 }
}
class Volume{
	public static void main(String args[]) {
		System.out.println("enter the length width and height of the box");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		box3 ob=new box3(a,b,c);
		 double v=ob.volume();
		 System.out.println("volume of the box "+ v );
		
			
		
	}
}
