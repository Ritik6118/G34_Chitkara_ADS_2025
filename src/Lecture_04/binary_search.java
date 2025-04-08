package Lecture_04;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		int lo=0;
		int hi=arr.length-1;
		int target=11;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==target) {
				System.out.println(mid);
				return;
			}
			else if(arr[mid]<target) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		System.out.println(-1);
	}

}
