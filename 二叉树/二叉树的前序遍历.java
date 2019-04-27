public class Main {
    private static class Node{
        char val;
        Node left;
        Node right;
        Node(char v){
            this.val = v;
        }
    }

    private static void preOrderTraversal(Node root){
        if(root != null){
            System.out.print(root.val+"");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
}
