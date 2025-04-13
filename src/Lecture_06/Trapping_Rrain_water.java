package Lecture_06;

public class Trapping_Rrain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int trap(int[] arr) {
		int [] left=new int [arr.length];
		int [] right=new int [arr.length];
		int max=0;
		for(int i=0;i<left.length;i++) {
			left[i]=Math.max(max,arr[i]);
			max=left[i];
		}
		max=0;
		for(int i=right.length-1;i>=0;i--) {
			right[i]=Math.max(max,arr[i]);
			max=right[i];
		}
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans+=Math.min(left[i], right[i])-arr[i];
		}
		return ans;
	}

}
