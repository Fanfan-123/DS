/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
     if(root != null){
         postorderTraversal(root.left);
         postorderTraversal(root.right);
         list.add(root.val);
     }
        return list;
    }
}
