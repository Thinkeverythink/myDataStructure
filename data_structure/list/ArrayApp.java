package list;

public class ArrayApp {
	
	public static void main(String[] args) {
		
	Array_ array_ = new Array_(5);
	array_.init(1);
	array_.init(2);
	array_.init(3);
	array_.init(4);
	array_.init(5);
	
	array_.display();
	System.out.println("=====================");
	System.out.println(array_.insert(4, 5));
	array_.display();
		
		
	}
	
	
	

}
