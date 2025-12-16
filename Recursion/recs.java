class recs{

    
    void recursion(int count){
        if(count==2)
           return ;
         System.out.println(count);
         count++;
         recursion(count);
    }
    public static void main(String[] args) {
        int c=0;
        recs obj=new recs();
        obj.recursion(c);
    }
}