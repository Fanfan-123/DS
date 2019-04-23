package www.fanfan.com;

import java.util.Arrays;

/**
 * author:kelly_fanfan
 */
public class Code_前序中序创建二叉树 {

    class Node{
        char val;
        Node left;
        Node right;
        Node(char v){
            this.val = v;
        }
    }

    public int find(char[] inorder,char v){
        for(int i = 0; i < inorder.length;i++){
            if(inorder[i] == 'v'){
                return i;
            }
        }
        return -1;
    }
    
    Node buildTree(char[] preorder,char[] inorder){
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        //1.
        char rootVal = preorder[0];
        Node root = new Node(rootVal);

        if(preorder.length == 1 && inorder.length == 1){
            return root;
        }
        //2
        int leftSize = find(inorder,rootVal);
        //3.
        char[] leftPreorder = Arrays.copyOfRange(preorder,1,1+leftSize);
        char[] leftInorder = Arrays.copyOfRange(inorder,0,leftSize);
        root.left = buildTree(leftPreorder,leftInorder);
        //4
        char[] rightPreorder = Arrays.copyOfRange(preorder,1+leftSize,preorder.length);
        char[] rightInorder = Arrays.copyOfRange(inorder,leftSize+1,inorder.length);
        root.right = buildTree(rightPreorder,rightInorder);
        //5
        return root;
    }
}
