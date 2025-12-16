class ques{
    
    int rec(int n){
        if(n<0)
         return 0;
        System.out.println("TUF");
        rec(n-1);
        return 0;
    }


public static void main(String[] args) {
    int num=10;
    ques obj= new ques();
     obj.rec(num);
    
}
    }
