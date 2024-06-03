package example;

public class ConTest {
	ConTest(){
    System.out.println("without argumet");
	}
	ConTest(int a){
		System.out.println(" a:"+a);
	}
	ConTest(int a, int b){
		System.out.println(" a:"+a +" b: " +b);
	}
	ConTest(float a, float b){
		System.out.println(" a:"+a + "b: "+b);
	}

}
class Demo5{
	public static void main(String args[]) {
     ConTest ct1=new ConTest();
     ConTest ct2=new ConTest(1);
     ConTest ct3=new ConTest(1,2);
     ConTest ct4=new ConTest(2.5f,3.5f);
    
	}
}