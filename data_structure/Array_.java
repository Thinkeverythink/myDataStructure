package list;

public class Array_ {
	
		private int[] arr;
		private int arrElems;
		
		public Array_(int size) {
			 
			 arr = new int[size];
			 arrElems = 0;
		 }
	     
		 public boolean find(int serchValue) {
			 int i = 0;
			 
			 for ( i = 0; i < arrElems; i++) {
				if (serchValue == arr[i]) {
					break;  //要记得用break退出循环，返回值要在循环外进行
				}
			}   //有两种可能会跳出循环，判断是哪一种，不同种的跳出循环是会返回不同的值！
			if (i == arrElems) {
				return false;
			}else {
				return true;
			}
 
		}
		 
		public boolean binaryFind(int serchValue) {
			int lowIndex = 0;
			int hightIndex = arrElems - 1;
			int halfIndex;
			
			while (true) {
					
			halfIndex = (lowIndex + hightIndex)/2;
			if(arr[halfIndex] == serchValue){
				return true;
			}else if (lowIndex > hightIndex) {  //如果没有元素，那么返回false
				return false;
			}else {
					if (arr[halfIndex] < serchValue) {
						lowIndex = halfIndex + 1;  //已经排除了不等于中间和大于左边，那么 赋值给左边的时候就要 中间 + 1 
					}else {
						hightIndex = halfIndex - 1;//已经排除了不等于中间和小于右边，那么 赋值给右边的时候就要 中间 - 1 			
					}
			}
				
			
			}	
			
		}
		 
		public void insert(int insertValue) {
			
			arr[arrElems++] = insertValue;
			
		}
		
		public boolean delete(int deleteValue) {
			
			int i;
			for (i = 0; i < arrElems; i++) {
				if(deleteValue == arr[i]){
					break;
				}
			}
			
			if (i == arrElems) {
				return false;
			}else {
					
				for (int j = i; j < arrElems-1; j++) {
					arr[j] = arr[j+1];	
				}
				arrElems--;				
				return true;
			}
			
			
		}
		
		public void display() {
			
			for (int i = 0; i < arrElems; i++) {
				System.out.print(arr[i] + "  ");
			
				
			}
	
		}
		 
		 
		
		
		
	

		
		
		
		

}





