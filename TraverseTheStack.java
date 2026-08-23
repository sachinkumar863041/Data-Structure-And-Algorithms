import java.util.Stack;

public class TraverseTheStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);

        // Traverse the stack
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i));
        }
    }
}