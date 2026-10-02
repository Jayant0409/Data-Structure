import java.sql.SQLOutput;
import java.util.Stack;

public class basicsOfStack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.size());
        st.push(5);
        st.push(10);
        st.push(4);
        st.push(38);
        System.out.println(st);
        System.out.println("size is "+st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());

    }
}
