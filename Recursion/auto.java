public class auto {
    public static void main(String[] args) {
        int ar2[]={1,2,3,4};
        int ar1[]={4,6,9,3,6,90,23};
        auto obj=new auto();
        obj.match(ar1,ar2,ar1.length,ar2.length);
    }
    void match(int arr1[],int arr2[],int l1,int l2){
        int c=0;

        for (int i = 0; i < l1; i++) {

            for (int j = 0; j < l2; j++) {
                if(arr1[i]==arr2[j])
                c=c+2;
            
                
            }
            
        }
        System.out.println((l1+l2)-c);
    }
    
}
