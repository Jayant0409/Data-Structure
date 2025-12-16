import java.util.Arrays;
public class a{
    public static void main(String[] args) {
        int ar[] = {1,6,3,4,8,4,3};
        // Arrays.sort(ar);
        // System.out.println(ar[6]);
        int max =ar[0];
        int smax = ar[0];
for (int i = 0; i < ar.length; i++) {
if(ar[i]>max){
    smax= max;
    max= ar[i];
}

    // if(ar[i]< max && ar[i]>smax)
    // smax =ar[i];
    
}
System.out.println(smax);
System.out.println(max);
    }
}



// ssmallest

int smallest = Integer.MAX_VALUE;
int ssmallest = Integer.MAX_VALUE;

for(int i=0;i<n;i++){
    if(ar[i]< smallest){
        ssmallest = smallest;
        smallest= ar[i];
    }   
    else if(ar[i]>smallest && ar[i]<ssmallest){
        ssmallest = ar[i]
    }
}

return ssmallest;