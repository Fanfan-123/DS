public class Main {
    private static class Node{
        char val;
        Node left;
        Node right;

        Node(char v){
            this.val = v;
        }
    }
    private static int height(Node root){
        if(root == null){
            return 0;
        }else{
            int left = height(root.left);
            int right = height(root.right);
            return (left>right?left:right)+1;
        }
    }
 }
