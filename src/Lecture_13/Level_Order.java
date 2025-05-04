package Lecture_13;
import java.util.*;
public class Level_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans=new ArrayList<>();
		if(root==null) {
			return ans;
		}
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		List<Integer> li = null;
		while(!q.isEmpty()) {
			int s=q.size();
			li=new ArrayList<>();
			while(s-->0) {
				TreeNode n=q.poll();
				li.add(n.val);
				if(n.left!=null) {
					q.add(n.left);
				}
				if(n.right!=null) {
					q.add(n.right);
				}
			}
			ans.add(li);
		}
		return ans;
	}

}
