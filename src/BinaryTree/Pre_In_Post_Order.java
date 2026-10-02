package BinaryTree;

public class Pre_In_Post_Order {

    public static class Node {
        int val;
        Node left;
       Node right;

        Node(int val){
            this.val = val;
        }
    }


    public static void preorder(Node root){

        if(root== null){
            return;
        }
        System.out.print(root.val+ ",");

        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){

        if(root== null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + ",");
    }


    public static void main(String[] args) {

        Node root = new Node(10);

        Node a = new Node(6);
        Node b = new Node(4);

        root.left = a;
        root.right = b;

        Node e = new Node(4);
        Node f = new Node(8);

        Node d = new Node(12);
        Node c = new Node(19);

        a.right = c;
        a.left = e;

        b.left = d;
        b.right = f;

        Node l = new Node(9);
        e.left = l;

        preorder(root);
        System.out.println();
        postorder(root);
    }


}
