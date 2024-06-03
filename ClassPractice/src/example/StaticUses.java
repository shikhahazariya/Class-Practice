
package example;

public class StaticUses {
	static int a=2,b;
	static void meth(int m) {
		System.out.println("A =" +m);
		System.out.println("A =" +a);
		System.out.println("A =" +b);
	}
		static {
			System.out.println(" static block initialize");
			b=a*4;
		}
			public static void main(String args[]) {
			meth(42);
			}
		}
		
	
		
		
		
		
		
		
		


