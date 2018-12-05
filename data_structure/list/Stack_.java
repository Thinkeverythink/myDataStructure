package list;

public class Stack_ {
  //封装一个数组，只能操作数组的尾部
   private char[] arrStack;
   private int maxSizeStack;
   private int top;
   
   
   public Stack_(int size){
	   
	   arrStack = new char[size];
	   maxSizeStack = size;
	   top = -1;
   }
   
   //入栈
   public boolean push(char value) {
	   if(top < maxSizeStack)
		   arrStack[++top] = value;
	   else {
		return false;
	}
	   return true;	     
   }
   //出栈
   public char pop() {
	 if (top != -1) {
		return arrStack[top--];
	 }
	 return 0;
   
}
   public void reverse() {
	 
	   while (top != -1) {
		System.out.println(this.pop());	
	}
	   
}
   
   
   //出栈
  /* public void  pop() {	 
	   if (stackSize != 0) {
		   System.out.println(arrStack[stackSize-1]);
		   stackSize--;
	   }
   }*/
	
	public int getStackSize() {
		return arrStack.length;
	}
	
/*	public int  getStackElemsNumbers() {
		return ;
	}
	*/
	
	public boolean isEmpty() {
		
		return top == -1;
	}
	
	public  boolean isFull() {
		
		return top == (maxSizeStack-1);
	}
	
	public char peek() {
		return arrStack[top];
	}
	
	
	
}
