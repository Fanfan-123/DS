package www.fanfan.com;

/**
 * author:kelly_fanfan
 */
 
import java.util.Arrays;
public class Code_二叉树面试题 {
    class Node {
        private char val;
        private Node left;
        private Node right;
        Node(char v) {
            this.val = v;
        }
    }

    class ReturnValue {
        Node node;
        int used;
        ReturnValue(Node node, int used) {
            this.node = node;
            this.used = used;
        }
    }

    ReturnValue createTree(char[] preorder) {

        char rootValue = preorder[0];
        Node root = new Node(rootValue);
        
        if (preorder.length == 0) {
            return new ReturnValue(null, 0);
        }
        if (rootValue == '#') {
            return new ReturnValue(null, 1);
        }
        
            char[] leftPreOder = new char[preorder.length - 1];
            leftPreOder = Arrays.copyOfRange(preorder, 1, preorder.length);
          
            ReturnValue leftReturn = createTree(leftPreOder);
          
            char[] rightPreorder = new char[preorder.length - 1 - leftReturn.used];
            rightPreorder = Arrays.copyOfRange(preorder, 1 + leftReturn.used, preorder.length);
            
            ReturnValue rightReturn = createTree(rightPreorder);
           
            root.left = leftReturn.node;
            root.right = rightReturn.node;
           
            return new ReturnValue(root, 1 + leftReturn.used + rightReturn.used);
    }
}
