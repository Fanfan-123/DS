public class Main {
    private static class Node{
        char val;
        Node left;
        Node right;

        Node(char v){
            this.val = v;
        }
    }
  private static int leafCount(Node root){
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            return 1;
        }else{
            return leafCount(root.left) + leafCount(root.right);
        }
    }  
  }
