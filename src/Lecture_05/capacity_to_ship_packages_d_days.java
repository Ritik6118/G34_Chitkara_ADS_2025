package Lecture_05;

public class capacity_to_ship_packages_d_days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int shipWithinDays(int[] arr, int d) {
		int lo=arr[0];
		int hi=0;
		for(int i=0;i<arr.length;i++) {
			lo=Math.max(arr[i], lo);
			hi+=arr[i];
		}
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isPossible(arr,mid,d)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

	private boolean isPossible(int[] arr, int cap, int days) {
		// TODO Auto-generated method stub
		int load=0;
		int day=0;
		for(int i=0;i<arr.length;i++) {
			load+=arr[i];
			if(load>cap) {
				day++;
				load=arr[i];
			}
		}
		day+=load/cap;
        if(load%cap!=0){
            day++;
        }
		return day<=days;
	}

}
