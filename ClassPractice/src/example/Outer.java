package example;

public class Outer {
	int outer=12;
	void test() {
		inner in=new inner();
		in.display();
		
	}
	class inner{
		void display() {
			System.out.println(outer);
		}
		
	}

}
class InnerClassDemo{
	public static void main(String args[]) {
		Outer ot=new Outer();
		ot.test();
	}
}