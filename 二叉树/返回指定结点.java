public class Main {
    private static class Node{
        char val;
        Node left;
        Node right;

        Node(char v){
            this.val = v;
        }
    }
    Node find2(Node root,char v){
        if(root == null){
            return null;
        }

        if(root.val == v){
            return root;
        }

        Node r = find2(root.left,v);
        if(r != null){
            return r;
        }
        r = find2(root.right,v);
        if(r != null){
            return r;
        }
        return null;
    }
 }
