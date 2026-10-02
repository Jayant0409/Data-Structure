package Searching;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BinarySearch {

    public static int searchBinary(int ar[], int target){
        int l = ar.length-1;
        int start = 0;
        int end = l;
        int mid =0;
        while(start<=end){
            mid = (start+end)/2;

            if(ar[mid] == target){
                return mid;
            } else if (ar[mid]<target) {
                start = mid+1;

            }else{
                end = mid-1;
            }

        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length for array");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.printf("Enter %d elements in the Array",  n);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();

        }
        System.out.println("Enter the target to search");
        int t = sc.nextInt();

      int indx =  searchBinary(ar, t);

      if(indx != 0)
          System.out.println("Found at index = "+ indx);
      else
          System.out.println("Not found");

    }
}
