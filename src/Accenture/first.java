package Accenture;

public class first {


    public static long equivalentSum(int num){
        long sum =0;
        int l =0;
        int n = num;
        while(n>0){
            sum = sum + n;
            n=n/10;
        }
        System.out.println(sum);

        return sum;

    }

    public static int[] subtract(int ar[]){
        int sum = 0;
        int l = ar.length;
        for(int i =0; i<l; i++){

            if(ar[i]%11 == 0){
                ar[i] = ar[i] + ar[i]/11;
            }
            else{
                ar[i] = ar[i]- ((i%7)*3);
            }
            sum = sum + ar[i];

        }
        System.out.println("sum of array = " + sum );
        return ar;
    }

    public static void main(String[] args) {

        int arr[] = {22, 5, 14};
      int[] a =  subtract(arr);
//        System.out.println(a);

      for (int i=0; i<a.length; i++) {
          System.out.print(a[i] + ",");
      }
        System.out.println();
          equivalentSum(112);

    }
}
