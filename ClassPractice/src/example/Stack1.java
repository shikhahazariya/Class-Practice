package example;

public class Stack1 {
	int arr[]=new int[10];
    int top;
    Stack1() {
    	top=-1;
    }
    	void push(int item) {
    		if(top==9) 
    			System.out.println("Stack is overflow");
    		else
    			arr[++top]=item;
    	}
    		int pop() {
    			if(top<0) {
    				System.out.println("Stack is underflow");
    		  return 0;
    			}else 
    			 return arr[top--];
}
}    
 		
    	class StackTest{
    		public static void main(String args[]) {
    		
    			System.out.println("Enter the range "  );
    			Stack1 st=new Stack1();
    			for(int i=0;i<10;i++)
    				st.push(i);
    				
  
    				for(int i=0;i<10;i++)
    					System.out.println("pop the array  " + st.pop() );
    		}
    	}
    	
    



