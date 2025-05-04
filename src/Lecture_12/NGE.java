package Lecture_12;

import java.util.Arrays;
import java.util.Stack;

public class NGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {11,7,6,8,5,4,9,20};
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[st.peek()]<arr[i]) {
				arr[st.pop()]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			arr[st.pop()]=-1;
		}
		System.out.println(Arrays.toString(arr));
	}

}
