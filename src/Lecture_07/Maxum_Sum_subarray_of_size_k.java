package Lecture_07;

public class Maxum_Sum_subarray_of_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,2,2,1,1,1,1,9,9,2,1,1};
		int k=3;
		// init the window
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		int max=sum;
		// slide the window and take maximum
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			max=Math.max(sum, max);
		}
		System.out.println(max);
	}

}
