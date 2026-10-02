import java.util.Scanner;
import java.util.Stack;

public class insertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter new element of Stack");
        int element = sc.nextInt();

        Stack<Integer> nst = new Stack<>();
        while (st.size()>=1) {
            nst.push(st.pop());
        }

        st.push(element);
        while(nst.size()>=1){
            st.push(nst.pop());
        }
        System.out.println(st);
        System.out.println("Size is:  "+st.size());

    }
}
