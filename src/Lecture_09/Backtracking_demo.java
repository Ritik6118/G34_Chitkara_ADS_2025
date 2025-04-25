package Lecture_09;

import java.util.ArrayList;

public class Backtracking_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li=new ArrayList<>();
		String st="";
		fun(0,li,st);
		System.out.println(li);
		System.out.println(st);
	}

	private static void fun(int i, ArrayList<Integer> li, String st) {
		// TODO Auto-generated method stub
		if(i==10) {
			System.out.println(st);
			return ;
		}
		li.add(i);
		System.out.println(st);
		System.out.println(li);
		fun(i+1,li,st+i+" ");
		li.remove(li.size()-1);
		System.out.println(st);
		System.out.println(li);
	}

}
