package Lecture_13;

import java.util.ArrayList;
import java.util.List;

class PreOrder {
    List<Integer> li=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        pre(root);
        return li;
    }
    public void pre(TreeNode root){
        if(root==null){
            return;
        }
        li.add(root.val);
        pre(root.left);
        pre(root.right);
        
    }
}