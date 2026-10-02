package BinaryTree;

import java.sql.SQLOutput;

public class Implementation {


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
        System.out.println(root.val);

        preorder(root.left);
        preorder(root.right);
    }



    //  size of the tree
     public static int size(Node root){
        if(root == null ) return 0;
        return 1 + size(root.left) + size(root.right);
     }

     // sum of the tree
     public static int sum(Node root){
        if(root == null) return 0;

        return root.val + sum(root.left) + sum(root.right);
     }

     // max value of the tree
     public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;

        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);

        return Math.max(a , Math.max(b, c));
     }

     // height of the tree
     public static int height(Node root){
        if(root == null || (root.left == null && root.right == null) ) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
     }

     // Min value of the tree
     public static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;

        return Math.min(root.val , Math.min(min(root.left), min(root.right)));
     }

     // Product of the tree
    public static int product(Node root){
        if(root == null) return 1;

        return root.val * product(root.left) * product(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        Node a = new Node(6);
        Node b = new Node(4);

        root.left = a;
        root.right = b;

        Node e = new Node(4);
        Node f= new Node(8);

        Node d = new Node(12);
        Node c = new Node(19);

        a.right = c;
        a.left = e;

        b.left = d;
        b.right = f;

        Node l = new Node(9);
        e.left = l;

        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
        System.out.println(min(root));
        System.out.println(product(root));

        preorder(root);
    }

}



























//
//
// public  static  class Node{
//        int val;
//        Node left;
//        Node right;
//
//        public Node(int val){
//            this.val = val;
//        }
//    }
//
////     public static void MaxNode(Node root){
////
////         int max = -1;
////
////
////     }
////
////     if(root.left.val > max){
////         max = root.val;
////     }
////
////      MaxNode(root.left);
////     MaxNode(root.right);
////
////    }
//
//
//    public static int display(Node root, int max){
//
//         if(root == null) {
////             System.out.println(" max val ="+ max);
//             return max;
//         }
//
//        System.out.print(root.val + "->");
//        if(root.left != null)
//            System.out.print(root.left.val + " ");
//
//        if(root.right != null) {
//            System.out.print(root.right.val + " ");
//        }
//
//        if(root.val > max){
//            max = root.val;
//        }
//
//        display(root.left, max);
//        display(root.right, max);
//
//        return max;
//
//
//
//
//
//        else System.out.print("null , ");
//        System.out.println();
//
//
//
//
//
//    }
//
//    public static void main(String[] args) {
//
//        Node root = new Node(10);
//        Node a = new Node(4);
//        Node b = new Node(2);
//        root.left = a;
//        root.right = b;
//
//        Node c = new Node(8);
//        Node d = new Node(12);
//        a.right = c;
//        b.left = d;
//
//        System.out.println("max val =  " +display(root, 0));
//  MaxNode(root);
//
//    }
//}

