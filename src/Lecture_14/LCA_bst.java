package Lecture_14;

public class LCA_bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		while(root!=null) {
			if((root.val==p.val || root.val==q.val) || (p.val<root.val && root.val<q.val) || (p.val>root.val && root.val>q.val)) {
				return root;
			}
			if(p.val<root.val && root.val>q.val ) {
				root=root.left;
			}
			else if(p.val>root.val && root.val<q.val){
				root=root.right;
			}
		}
		return null;
	}

}
