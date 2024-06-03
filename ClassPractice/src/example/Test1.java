package example;

public class Test1 {
	int a,b;
	Test1 (int i,int j){
		a=i;
		b=j;
	}
		//return true if 0 is equal the invoking method
    boolean equals(Test1 o) {
    	if(o.a==a && o.b==b)
    		return true;
    
    	else
    	return false;
    }
	}
class Demo6{
	public static void main(String args[]) {
		Test1 t1=new Test1(1, 0);
		Test1 t2=new Test1(1, 0);
		Test1 t3=new Test1(1,10);
		System.out.println(" t1=t2 "+t1.equals(t2));
		System.out.println(" t1=t3 "+t1.equals(t3));
		
		
	}
}

