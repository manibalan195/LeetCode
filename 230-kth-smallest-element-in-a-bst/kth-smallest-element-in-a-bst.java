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
    int count ;
    int result;
    public int kthSmallest(TreeNode root, int k) {
        count = 0;
        result = -1 ;
        inorder(root,k);
        return result;
    }
    public void inorder(TreeNode root,int k){
        if(root == null || result == 0)  return;
        
        inorder(root.left,k);
        count += 1;
        if (count == k) {
            result = root.val;
            return;
        }
        inorder(root.right,k);
    }
}