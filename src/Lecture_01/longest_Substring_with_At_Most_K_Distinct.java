package Lecture_01;

import java.util.HashMap;

public class longest_Substring_with_At_Most_K_Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabaaaa";
		int k=2;
		int a=solve(s,k);
		System.out.println(a);
	}

	private static int solve(String s, int k) {
		// TODO Auto-generated method stub
		int si=0;// starting index of sliding window
		int ei=0;// ending index of sliding window
		
		HashMap<Character,Integer> map=new HashMap<>();
		int max=0;
		while(ei<s.length()) {
			char ch_ei=s.charAt(ei);
			if(map.containsKey(ch_ei)) {
				int curfreq=map.get(ch_ei);
				map.put(ch_ei, curfreq+1);
			}
			else {
				map.put(ch_ei, 1);
			}
			
			while(map.size()>k && si<ei ) {
				char ch_si=s.charAt(si);
				int curfreq=map.get(ch_si);
				map.put(ch_si, curfreq-1);			
				si++;
			}
			
			max=Math.max(max,ei-si+1);
			
			ei++;
		}
		return max;
	}

}
