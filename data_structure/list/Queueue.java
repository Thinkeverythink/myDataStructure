package list;

public class Queueue {
	
	private int[] que;
	private int rear;
	
	public Queueue(int queSize){
		que = new int[queSize];
		rear = 0;		
	}
	
	public boolean insert(int value){
		if (rear < que.length) {
			que[rear++] = value;
			return true;
		}else {
			
			return false;
		}	
	}
	
	public boolean remove(){
		
		if(rear > 0){
			for (int i = 0; i < rear-1; i++) {
				que[i] = que[i+1];
				
			}	
			rear--;
		}else {
			return false;
		}
		
		return true;
		
	}
	
	public void display() {
		for (int i = 0; i < rear; i++) {
			System.out.println(que[i]);
		}
	}
	
	public int getQueSize() {
		
		return rear;
	}
	
	
	
	
	
	
	

}
