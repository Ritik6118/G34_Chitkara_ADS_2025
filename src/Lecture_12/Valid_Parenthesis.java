package Lecture_12;

import java.util.Stack;

public class Valid_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="(){]";
		System.out.println(isValid(s));
	}

	private static boolean isValid(String s) {
		// TODO Auto-generated method stub
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='{'||ch=='('||ch=='[') {
				st.push(ch);
			}
			else {
				if(st.isEmpty()) {
					return false;
				}
				if(Math.abs(st.peek()-ch)>2) {
					return false;
				}
				st.pop();
			}
		}
		return st.isEmpty();
	}

}
