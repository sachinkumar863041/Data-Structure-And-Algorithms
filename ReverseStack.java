import java.util.Stack;

public class ReverseStack {

    // Insert an element at the bottom of the stack
    static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int temp = st.pop();

        insertAtBottom(st, x);

        st.push(temp);
    }

    // Reverse the stack
    static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int temp = st.pop();

        reverseStack(st);

        insertAtBottom(st, temp);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Original Stack: " + st);

        reverseStack(st);

        System.out.println("Reversed Stack: " + st);
    }
}