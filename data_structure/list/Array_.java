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
		 //二分查找只能查找有顺序的顺序表
		public int binaryFind(int serchValue) {
			int lowIndex = 0;
			int hightIndex = arrElems - 1;
			int halfIndex;
			
			while (true) {
					
			halfIndex = (lowIndex + hightIndex)/2;
			if(arr[halfIndex] == serchValue){
				return halfIndex + 1;
			}else if (lowIndex > hightIndex) {  //如果没有元素，那么返回false
				return -1;
			}else {
					if (arr[halfIndex] < serchValue) {
						lowIndex = halfIndex + 1;  //已经排除了不等于中间和大于左边，那么 赋值给左边的时候就要 中间 + 1 
					}else {
						hightIndex = halfIndex - 1;//已经排除了不等于中间和小于右边，那么 赋值给右边的时候就要 中间 - 1 			
					}
			}
				
			
			}	
			
		}
		 //第二种写法
		//二分查找,返回元素所在的第几个位置
		public int binaryFind1(int value){
			int halfIndex;
			int lowIndex = 0;
			int hightIndex = arrElems - 1;
			
			if (value < arr[0] || value > arr[hightIndex] || lowIndex > hightIndex) {
				return -1;
			}
			
			while (lowIndex <= hightIndex) {
				halfIndex = (lowIndex + hightIndex)/2;
				if (arr[halfIndex] == value) {  //有两种情况
					return halfIndex + 1;
				}else if (arr[halfIndex] < value) { //一次只有一个被赋值！不能两个(lowIndex,hightIndex)都赋值
						lowIndex = halfIndex + 1;
				}else {
					hightIndex = halfIndex - 1;
				}
					
				
				
			}
			
			
			return -1;
			
			
		}
		 
		public void init(int value) {
			
			arr[arrElems++] = value;
			
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
		 
		 //插入第几个位置
		/*
		 * 1、判断插入位置是否合理    
		 * 2、如果插入位置是1或者等于表里元素个数，直接插入
		 * 3、如果插入位置不是2的情况，那么就需要将 该位置上及以后的元素依次后移一个位置
		 */
		public boolean insert(int loc,int value){
			int i;
			
			if (loc < 1 ||  loc > arrElems + 1 || arrElems + 1 > arr.length) {  //表容量已满 和 插入位置不合理
				        // arr.length 等于正常数
				return false;
			}
			
			if (loc == 1 && arrElems == 0 || loc == arrElems + 1) {
				arr[loc - 1] = value;
			}
			
			for (i = arrElems ;  i >= loc ; i--) {//i >= loct 移到插入位置
				arr[i] = arr[i-1];	//先移最后一个	
			}
			arr[loc - 1] = value; 
			arrElems++;
			

			return true;
		
		}

		
		
	

		
		
		
		

}





