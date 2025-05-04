package Lecture_13;

public class sum_root_to_leaf_numbers {

	int sum = 0;

	public int sumNumbers(TreeNode root) {
		solve(0, root);
		return sum;
	}

	public void solve(int c, TreeNode root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			c += root.val;
			sum += c;
			return;
		}
		c += root.val;
		solve(c * 10, root.left);
		solve(c * 10, root.right);

	}
}
