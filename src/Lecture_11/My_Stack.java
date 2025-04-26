package Lecture_11;

public class My_Stack {
	private int [] arr;
	private int top;
	
	My_Stack(){
		arr=new int[10];
	}
	My_Stack(int n){
		arr=new int[n];
	}
	
	public void push(int n) {
//		if(this.isFull()) {
//			System.out.println("stack_is_full");
//			return;
//		}
		arr[top]=n;
		top++;
		if(top==arr.length) {
			grow();
		}
		
	}
	private void grow() {
		// TODO Auto-generated method stub
		int [] arr2=new int[arr.length*2];
		for(int i=0;i<top;i++) {
			arr2[i]=arr[i];
		}
		this.arr=arr2;
	}
	public int pop() {
		if(this.isEmpty()) {
			System.out.println("stack is empty");
			return 0;
		}
		return arr[--top];
	}
	public int peek() {
		if(this.isEmpty()) {
			System.out.println("stack is empty");
			return 0;
		}
		return arr[top-1];
	}
	public boolean isEmpty() {
		return top==0;
	}
//	public boolean isFull() {
//		return top==arr.length;
//	}
	public int size() {
		return top;
	}
	@Override
	public String toString() {
		String s="[ ";
		for(int i=0;i<top;i++) {
			s+=arr[i]+", ";
		}
		return s+"]";
	}
	
	
}
