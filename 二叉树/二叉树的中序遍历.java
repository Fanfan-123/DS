public class Main {
    private static class Node{
        char val;
        Node left;
        Node right;
        Node(char v){
            this.val = v;
        }
    }
    private static void inOrderTraversal(Node root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.val+"");
            inOrderTraversal(root.right);
        }
    }
  }
