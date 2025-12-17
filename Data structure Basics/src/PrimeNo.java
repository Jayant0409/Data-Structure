import java.sql.SQLOutput;
import java.util.*;

public class PrimeNo {

    public static int printPrime(int num){

        int n =2;

        while(n<=num){
            boolean isPrime = true;
//            if(n==2){
//                System.out.println(n);
//            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0)
                    isPrime = false;
            }
            if(isPrime == true){
                System.out.println("Prime no. "+ n);
            }
            n++;
        }
        return 0;
    }


    void testFunction(){
        System.out.println("Testing it");
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number");

        int num = Sc.nextInt();
        printPrime(num);






    }
}
