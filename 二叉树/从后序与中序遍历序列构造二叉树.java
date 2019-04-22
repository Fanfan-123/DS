package www.fanfan.com;

import java.util.Arrays;

/**
 * author:kelly_fanfan
 */
public class Code_中序后序创建二叉树 {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int v){
            this.val = v;
        }
    }

    public int find1(int[] inorder,int v){
        for(int i = 0;i < inorder.length;i++){
            if(inorder[i] == v){
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0 || inorder.length == 0){
            return null;
        }
        //在后序中找到根结点
        int rootVal = postorder[postorder.length-1];
        TreeNode root = new TreeNode(rootVal);
        if(postorder.length == 1 && inorder.length == 1){
            return root;
        }
        //在中序中找到跟结点所在下标
        //根结点所在的下标就是后序中左子树的结点数
        int leftSize = find1(inorder,rootVal);
        if(leftSize == -1){
            return null;
        }
        //找出左子树的后序数组和中序数组
        int[] leftPostorder = Arrays.copyOfRange(postorder,0,leftSize);
        int[] leftInorder = Arrays.copyOfRange(inorder,0,leftSize);
        //递归
        root.left = buildTree(leftInorder,leftPostorder);
        //找出右子树的后序数组和中序数组
        int[] rightPostorder = Arrays.copyOfRange(postorder,leftSize,postorder.length-1);
        int[] rightInorder = Arrays.copyOfRange(inorder,leftSize+1,inorder.length);
        root.right = buildTree(rightInorder,rightPostorder);
        return root;
    }
}
