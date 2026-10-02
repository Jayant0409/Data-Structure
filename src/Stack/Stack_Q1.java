import java.util.*;

public class Stack_Q1 {

    public static String reverseString(String str){
               Stack<Character> s = new Stack<>();
        for(int i =0; i<str.length();i++){
        char c = str.charAt(i);
         s.push(c);
       }

       StringBuilder str2= new StringBuilder("");

        while(!s.isEmpty()){
         char c2 = s.pop();
         str2 = str2.append(c2);
       }

       return str2.toString();

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str = Sc.nextLine();
        
       
      String result = reverseString(str);

       System.out.println("reversed string: "+ result);
    }
}