package Sorting;

public class MergeSort {

    public static void mergeSorting(int ar[], int l, int r){

        if(l >= r) {
            return  ;
        }

        int mid = (l+r)/2;
             mergeSorting(ar, l ,mid);
             mergeSorting(ar, mid+1, r);
             merge(ar, l,mid, r);

    }

   public static void merge(int ar[], int l, int mid, int r){

        int n1 = mid -l+1;
        int n2 = r - mid;
        int left[] =new int[n1];
        int right[] = new int[n2];
        int i; int j; int k;
        for(i=0;i<n1; i++){
            left[i] = ar[l+i];
        }
        for(j = 0;j<n2; j++){
            right[j] = ar[mid+1+j];
        }
        i=0; j=0; k =l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                ar[k]=left[i];
                k++; i++;
            }else{
                ar[k]=right[j];
                k++; j++;
            }
        }

        while(i<n1){
            ar[k] =left[i];
            k++; i++;
        }

        while(j<n2){
            ar[k] = right[j];
            k++; j++;
        }

   }

   public static void display(int ar[]){
        for(int i : ar){
            System.out.print(i + " ");
        }
   }

    public static void main(String[] args) {
        int ar[] ={7,2,8,4,6,3};
        System.out.println("Array before sorting");
        display(ar);
        System.out.println();
         mergeSorting(ar, 0, ar.length-1);
        System.out.println("Array after sorting");
        display(ar);
    }
}
