class para{
    void parameterized(int i,int sum){
        if(i<1){
            System.out.println(sum);
          return;
        }
        sum=sum+i;
        i=i-1;
        parameterized(i,sum);
    }
    // functional Recursion
    int sum(int n) {

        if(n==0)
        return 0;
        else
        return n+sum(n-1);

    }

    int factorial(int n){
        if(n==1)
        return 1;
        else
        return n*factorial(n-1);

    }


    public static void main(String[] args) {
        int num=10;
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<6;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        para obj=new para();
        obj.parameterized(num,0);
        System.out.println(obj.sum(num)); 
        System.out.println(obj.factorial(num));
        int l=arr.length;
        obj.array(0,l-1,arr);
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
      
        String s="NAMAN";
        int ln=s.length();
        int j=0;
       System.out.println(obj.check(s));
 
    }

    void  array(int i,int j,int ar[]){
        int temp=0;
        if(i>=j)
        return;
        else{
            temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
        }
          array(i+1,j-1,ar);
    }
     boolean check(String st){
        
    String clean = st.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    return palin(clean, 0);
    }
       static boolean palin(String str,int i){
             int n=str.length();  
               if(i>=n/2)
               return true;

               if(str.charAt(i)!=str.charAt(n-i-1))
                return false;
                else {
                //    i= i+1;
                return palin(str,i+1);
                }
       }
}




