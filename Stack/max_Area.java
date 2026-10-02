 
//  maximum area of rectangle in a histogram 
 
 import java.util.Stack;

public class max_Area {

    static int  next_sm_Right[] = new int[6];
    static int  next_sm_Left[] = new int[6];

    public static void next_Smaller(int ar[]){
   
        Stack<Integer> s= new Stack<>();
        for (int i = ar.length-1; i >= 0; i--) {

            while (!s.isEmpty() && ar[s.peek()] >= ar[i]) {
                s.pop();   
            }

            if(s.isEmpty()){
                next_sm_Right[i] = ar.length;
            }else  {
                next_sm_Right[i] = s.peek();
            }

            s.push(i);
            
        }
            System.out.println("next_sm_Right : ");
         for (int i = 0; i < next_sm_Right.length; i++) {
            System.out.print(next_sm_Right[i] + " ,");
        } 

            s.clear();
         for (int i = 0; i <= ar.length-1; i++) {

            while (!s.isEmpty() && ar[s.peek()] >= ar[i]) {
                s.pop();   
            }

            if(s.isEmpty()){
                next_sm_Left[i] = -1;
            }else  {
                next_sm_Left[i] = s.peek();
            }

            s.push(i);
            
        }


        System.out.println("next_sm_Left: ");
         for (int i = 0; i < next_sm_Left.length; i++) {
            System.out.print(next_sm_Left[i] + " ,");
        }


          int max_A = Integer.MIN_VALUE;
          int area = 0;
        for (int i = 0; i < ar.length; i++) {

             area = ar[i] * (next_sm_Right[i]-next_sm_Left[i] - 1);
            
             if(area > max_A){
                max_A = area;
             }
            
        }

        System.out.println("max area = "+ max_A);
        

    }

    public static void main(String[] args) {
        int arr[]= {2,1,5,6,2,3};

        next_Smaller(arr);

       
    }
    
}

    
