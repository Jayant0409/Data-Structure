import java.util.*;

public class Reverse_Stack {

     public static void PushAtBottom(Stack<Integer> s, int topp){

        if(s.isEmpty()){
            s.push(topp);
            return ;
        }

       int tp  = s.pop();
        PushAtBottom(s, topp);
        s.push(tp);


    }

    public static void reverseStack(Stack<Integer> s){

        if(s.isEmpty()){
          
            return ;
        }

        int top = s.pop();
        reverseStack(s);

           PushAtBottom(s, top);
           return;
           
    }

    public static void main(String[] args) {
      Stack<Integer> s= new Stack<>();
        
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);


      reverseStack(s);

      while (!s.isEmpty()) {
        System.out.println(s.pop());
        
      }

        
    }
    
}
