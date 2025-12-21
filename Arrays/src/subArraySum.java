

public class subArraySum {

    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5};
 int n = ar.length;
 int smallest = Integer.MAX_VALUE;
 int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
               int sum=0;
                for (int k = i; k <= j; k++) {
                    System.out.print(ar[k]);
                    sum = sum+ar[k];
                }
                System.out.println("\nSubArray sum ="+ sum);
                if (largest<sum){
                    largest = sum;
                }

                if(smallest>sum){
                    smallest = sum;
                }
                System.out.println();
            }
            System.out.println("");

        }
        System.out.println("Maximum sum = "+ largest);
        System.out.println("Minimum sum = "+ smallest);

    }
}
