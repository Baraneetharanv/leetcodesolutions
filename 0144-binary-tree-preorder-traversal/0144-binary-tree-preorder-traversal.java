/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> a=new ArrayList<>();
       display(root,a);
       return a;
    }
    void display(TreeNode root,List<Integer> a)
    {
        if(root==null)
        return; 
        a.add(root.val);
        display(root.left,a);
        display(root.right,a);
    }
}
