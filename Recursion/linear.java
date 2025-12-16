public class linear {

    // void fun(int i,int n){
    //     // if(n<i)
    //     // return;
    //     // n=n-1;
    //     // fun(i,n);
    //     // System.out.println(n);
    // }

    void backtrack(int i,int n)
    {
        if(i>=n)
        return;
        i=i+1;
        backtrack(i,n);
        System.out.println(i);
    }


    public static void main(String[] args) {
        int num=10;
        linear obj= new linear();
           int a=1;
        // obj.fun(a,num);
        obj.backtrack(a,num);
    }
}
    