package Array_2D;

import java.util.Scanner;

public class Basics {

   public static void sum(int[][] ar, int[][] ar2){
       int[][] newArray = new int[ar.length][ar2.length];

       for (int i = 0; i < ar.length; i++) {

           for (int j = 0; j < ar[i].length; j++) {
               newArray[i][j] = ar[i][j] + ar2[i][j];
           }
       }
       System.out.println("Resultant array");
       printArray(newArray);
   }

   public static void multiplyArray(int[][] ar, int[][] ar2){
         if(ar[0].length == ar2.length) {
             int[][] newArray = new int[ar.length][ar2.length];

             for (int i = 0; i < ar.length; i++) {

                 for (int j = 0; j < ar[i].length; j++) {
                 newArray[i][j] = ar[i][j] * ar2[j][i];
                 }
             }
             System.out.println("Multiplied Array is: ");
             printArray(newArray);

         }else{
             System.out.println("Multiply is not possible");
         }
   }

    public static void printArray(int[][] ar){
        for(int i = 0; i < ar.length; i++) {

            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no. of rows");
        int r = sc.nextInt();
        System.out.println("enter the no. of columns");
        int c = sc.nextInt();

        int[][] ar = new int[r][c];
        int[][] ar2 = new int[c][r];
        System.out.println("Now enter " + r*c + " integer elements for 1st array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                 ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("Now enter " + r*c + " integer elements for 2nd array");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ar2[i][j] = sc.nextInt();
            }
        }
        System.out.println("FirstArray: ->");
        printArray(ar);
        System.out.println("Second Array: ->");
        printArray(ar2);
multiplyArray(ar, ar2);
//        sum(ar,ar2);
    }
}
