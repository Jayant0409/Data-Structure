import java.util.Stack;

public class next_GreaterElement {

    static int  next_Great[] = new int[6];

    public static void next_Greater(int ar[]){
   
        Stack<Integer> s= new Stack<>();
        for (int i = ar.length-1; i >= 0; i--) {

            while (!s.isEmpty() && s.peek()<= ar[i]) {
                s.pop();   
            }

            if(s.isEmpty()){
                next_Great[i] = -1;
            }else  {
                next_Great[i] = s.peek();
            }

            s.push(ar[i]);
            
        }
        

    }

    public static void main(String[] args) {
        int arr[]= {2,5,3,8,4,9};

        next_Greater(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(next_Great[i] + " ,");
        }
    }
    
}
