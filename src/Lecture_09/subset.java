package Lecture_09;

import java.util.ArrayList;

public class subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4};
		solve(arr,0,new ArrayList<>());
	}

	private static void solve(int[] arr, int i, ArrayList li) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			System.out.println(li);
			return ;
		}
		solve(arr,i+1,li);
		li.add(arr[i]);
		solve(arr,i+1,li);
		li.remove(li.size()-1);
	}		

}
