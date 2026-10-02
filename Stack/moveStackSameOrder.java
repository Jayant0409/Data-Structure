import java.util.Scanner;
import java.util.Stack;

public class moveStackSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter size of Stack");
        int n = sc.nextInt();
        System.out.println("Enter the Elements");
        for (int i = 0; i < n; i++) {
            int no = sc.nextInt();
            st.push(no);
        }
        System.out.println("Size is:  "+st.size());
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>=1){
            rt.push(st.pop());
        }
        System.out.println(st);
        System.out.println(rt);

        Stack<Integer> gt = new Stack<>();
        while(rt.size()>=1){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
