package example;

public class OverloadMethod {
	void test() {
		System.out.println(" without parameter ");
	}
	void test(int a) {
		System.out.println(" with parameter a = "+ a);
	}
	void test(int a, int b) {
		System.out.println(" a: "+a +"b :"+ b);
	}
	double test(float a,double b) {
		System.out.println(" a: "+a+"b :"+b);
		return 0;
	}
	
		
	}	
class Demo4{
	public static void main(String args[]) {
		OverloadMethod od=new OverloadMethod();
		od.test();
		od.test(1);
		od.test(10,45);
		od.test(1.5f, 2.5);
		
		
	}
}

