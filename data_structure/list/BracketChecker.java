package list;

public class BracketChecker {

	private String inputString;
	
	public BracketChecker(String in){
		
		inputString = in;
	
	}
	
	public void check(){
		
		int stackSize = inputString.length();
		Stack_ stack_ = new Stack_(stackSize);
		
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			switch (ch) {
			case '{':
			case '[':
			case '(': stack_.push(ch);break;
			// a{b(c[d]e)f}
			case '}':
			case ']':
			case ')':
				if (!stack_.isEmpty()) {
					char chx = stack_.pop();
					if (ch == '}' && chx != '{' ||
						ch == ']' && chx != '[' ||
						ch == ')' && chx != '(') {
						
						System.out.println("Error:" + ch + " at " + i);
					}else {
						//System.out.println("Error:" + ch + " at " + i);
					}
						break;	
				}
				

			default:
				break; //匹配的话不做任何处理,继续下一循环
			}
				
			
		}
		if (!stack_.isEmpty()) {  //循环完了，但是入栈的元素没有被匹配完，那么就报错
			System.out.println("Error: missing right delimiter");
			
		}
		
		
	}
	
	
	
}
