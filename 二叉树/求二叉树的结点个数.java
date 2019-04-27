public class Main {
    private static class Node{
        char val;
        Node left;
        Node right;

        Node(char v){
            this.val = v;
        }
    }
    
    //1.遍历二叉树，每遇到一个结点，就加1
  private static int count = 0;
    private static  void count1(Node root){
        while(root != null){
            count1(root.left);
            count1(root.right);
            count++;
        }
    }
    
    //2.使用递归，用子问题的思想
    private static int count(Node root){
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            return 1;
        }else{
            return count(root.left) + count(root.right)+1;
        }
    }  
  }
