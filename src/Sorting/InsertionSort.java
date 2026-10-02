package Sorting;

public class InsertionSort {

    public static int [] Insertion(int ar[]){

        int temp =0;
        int n = ar.length;
        for(int i=1;i<n;i++){
            int j =i;
            while(j>0 && ar[j]<ar[j-1]){
                temp = ar[j];
                ar[j] = ar[j-1];
                ar[j-1] = temp;
                j--;
            }
        }
        return ar;
    }
    public static void main(String[] args) {
        int ar[] = {2,5,1,3,6};
        Insertion(ar);
        System.out.println();
        for(int i: ar){
            System.out.print(i+" ");
        }
    }
}
