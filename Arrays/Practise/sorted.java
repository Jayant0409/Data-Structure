public class sorted {
    public static void main(String[] args) {
        int ar[] = {1,2,4,6,8,5,4};
        int c=0;
        for (int i = 0; i < ar.length-1; i++) {
               if(ar[i]<ar[i+1]){
                continue;
               }
               else{
                c = -1;
               }
        }
        if(c!=-1)
        System.out.println("array is sorted");

    else{
        System.out.println("array is not sorted");
    }
}
}