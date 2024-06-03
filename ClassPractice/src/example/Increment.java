package example;

public class Increment {
	int a;
	Increment(int i){
		a=i;
	}
	Increment incbyTen() {
		Increment in=new Increment(a+10);
		return in;
	}

}
 class Demo7{
	 public static void main(String args[]) {
		 Increment in1=new Increment(3);
		 Increment in2;
		 in2=in1.incbyTen();
		 System.out.println(" increment.a" +in1.a);
		 System.out.println(" increment.a" +in2.a);
		 in2=in2.incbyTen();
		 System.out.println(" increment.a" +in2.a);
	 }
 }
