package list;

public class ReverseString {

	private String inputString;
	private String outputsString = "";
	private Stack_ stack_;
	
	public ReverseString(String str) {
		inputString = str;
		stack_ = new Stack_(str.length());
	}
	
	public String reverseString() {
		
		for (int i = 0; i < inputString.length(); i++) {
			stack_.push(inputString.charAt(i));
		}
		
		for (int j = 0; j < inputString.length(); j++) {
			outputsString = outputsString + stack_.pop();
		}
		
		return outputsString;
	}
	
	
	
	
	
	
	
	
}
