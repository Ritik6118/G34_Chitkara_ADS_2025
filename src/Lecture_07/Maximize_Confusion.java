package Lecture_07;

public class Maximize_Confusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=maxConsecutiveAnswers("TFFT",2);
		System.out.println(a);
	}
	public static int maxConsecutiveAnswers(String s, int k) {
        
		int a=getmax(s,k,'T');
		int b=getmax(s,k,'F');
		return Math.max(a,b);
    }
	private static int getmax(String s, int k, char ch) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		int flips=0;
		int ans=0;
		while(ei<s.length()) {
			if(s.charAt(ei)!=ch) {
				flips++;
			}
			while(flips>k && si<ei) {
				if(s.charAt(si)!=ch) {
					flips--;
				}
				si++;
			}
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}
