package Lecture_14;

public class Kth_Smallest_in_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int c=0;
	int ans=0;
	public int kthSmallest(TreeNode root, int k) {
		inOrder(root,k);
		return ans;
	}
	private void inOrder(TreeNode root, int k) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		inOrder(root.left,k);
		c++;
		if(c==k) {
			ans=root.val;
		}
		inOrder(root.right,k);
	}
	

}
