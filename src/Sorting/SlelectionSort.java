package Sorting;

public class SlelectionSort {

    public static int[] Selection(int ar[]){
        int temp =0;
        int n = ar.length;
//        int count =0;

        for(int i=0; i<n-1;i++){
            int min_idx = i;
//            count =0;
            for(int j=i+1;j<n-1;j++){

                if(ar[min_idx]>ar[j]){
                    min_idx = j;
                }
            }

            if(min_idx != i){
//                count++;
                temp = ar[i];
                ar[i] = ar[min_idx];
                ar[min_idx] = temp;
            }
//            "No. of swaps in each pass"
//            System.out.print(count + ",");
        }
        return ar;
    }

    public static void main(String[] args) {
        int ar[] = {2,5,1,3,6};
        Selection(ar);
        System.out.println();
        for(int i: ar){
            System.out.print(i+" ");
        }

    }
}
