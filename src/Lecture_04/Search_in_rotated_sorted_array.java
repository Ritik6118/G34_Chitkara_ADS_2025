package Lecture_04;

public class Search_in_rotated_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int search(int[] arr, int t) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (arr[mid] == t) {
				return mid;
			}
			if (arr[lo] <= arr[mid]) {
				// left half sorted
				if (arr[lo] <= t && t <= arr[mid]) {
					// ans is in left half and discard right half
					hi = mid - 1;
				} else {
					// ans was not in left half might be possible to exist in right half
					lo = mid + 1;
				}
			} else if (arr[mid] <= arr[hi]) {
				// right half sorted
				if (arr[mid] <= t && t <= arr[hi]) {
					// ans is in right half discard left half
					lo = mid + 1;
				} else {
					// ans was not in right half might be possible to exist in left half
					hi = mid - 1;
				}
			}
		}
		return -1;
	}

}
