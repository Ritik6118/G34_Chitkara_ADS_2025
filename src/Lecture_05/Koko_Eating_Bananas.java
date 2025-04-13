package Lecture_05;

public class Koko_Eating_Bananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minEatingSpeed(int[] arr, int h) {
        int lo=1;// min eating rate
        int hi=arr[0];//maximum eating rate max of arr
        for(int i:arr) {
        	hi=Math.max(i,hi);
        }
        
        int ans=0;
        while(lo<=hi) {
        	int mid=lo+(hi-lo)/2;
        	if(isPossible(arr,mid,h)) {
        		ans=mid;
        		hi=mid-1;
        	}
        	else {
        		lo=mid+1;
        	}
        }
        return ans;
        
    }
	private boolean isPossible(int[] arr, int r, int h) {
		// TODO Auto-generated method stub
		int t=0;
		for(int i=0;i<arr.length;i++) {
			t+=arr[i]/r;
			if(arr[i]%r !=0) {
				t+=1;
			}
			if(t>h) {
				return false;
			}
		}
		return true;
	}

}
