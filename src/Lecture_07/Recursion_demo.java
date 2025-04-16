package Lecture_07;

public class Recursion_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		head(n);
		tail(n+1,1);
	}

	private static void tail(int i, int j) {
		// TODO Auto-generated method stub
		if(i==j) {
			return;
		}
		System.out.println(j);
		tail(i,j+1);
	}

	private static void head(int i) {
		// TODO Auto-generated method stub
		if(i==0) {
			return;
		}
		head(i-1);
		System.out.println(i);
	}
	
	

}
