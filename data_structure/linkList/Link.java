package linkList;

public class Link {
	 
	Node head = null; //Link借助Node对象来存数据,head是头指针
					
	
	public Link(){
		
	}
	//给链表排序
	
	
	
	
	//给链表添加节点,类似数组的添加数据！ new一个Link，相当于new一个数组，两者都是容器
	public void addNode(int nodeValue){
		Node newNode = new Node(nodeValue);
		Node temp;
		if (head == null) {
			head = newNode;
			return ;//如果head即头指针为 null，赋值
		}
		temp = head;
		while (temp.next != null) {
			temp = temp.next;		
		}
		temp.next = newNode;
		
	}
	//打印链表的所有值
	public void display(){
		Node temp;
		if (this.head == null) {
			System.out.println("链表没有值");
		}
		temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		
	}
	
	//传入用户想要删除的是第几个元素
	public int delete(int index){
		Node temp = head;
		Node point = temp.next; //point初始指向第二个元素
		int c=2; //用来记录point指出向第几个元素
		
		if (index < 1 || index > this.count()) {
			return 0;
		}
		
		if (index == 1) {
			head = temp.next;
			return 1;
		}
		
		while (point != null) {
			if (c == index) {   
				temp.next = point.next;
				break;
			}
			c++;  //point 循环一次c++就说明point指向了下一个元素
			temp = temp.next;
			point = point.next;	
		}

		return 2;
	}
	
	
	//统计链表里的元素个数
	public int count(){
		Node temp = head;
		int elems=0;
		if (temp == null) {
			return elems;
		}
		
		while(temp != null) {
			temp = temp.next;
			elems++;
		}
		
		return elems;
		
	}
	
	//插入
	public boolean insert(int index,int value){
		
		Node tempNode = head;
		Node pointNode = tempNode.next;
		Node newNode = new Node(value);
		int point = 2;//计数pointNode
		
		if (index < 1 || index > this.count()) {
			return false;
		}
		if (index == 1) {
			newNode.next=tempNode;
			head = newNode;
			return true;
		}
		
		while (pointNode != null) {
			if (point == index) {
				newNode.next = pointNode;
				tempNode.next = newNode;
			}
			point++;
			tempNode = tempNode.next;
			pointNode = pointNode.next;
		}
		
		return true;
			
	}
	//找到元素后，返回它在链表中的第几个位置,0表示找不到
	public int find(int value){
		Node temp = head;
		int index = 1;
		
		
		while (temp != null) {
			if (temp.data == value) {
				break;
			}
			temp = temp.next;
			index++;
		}
		
		if (temp == null) {
			return 0;
		}else {
			return index;
		}
		
		
	}
	
	
}
