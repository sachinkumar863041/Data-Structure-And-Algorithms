import java.util.*;

public class ReverseAQueuse {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        Stack<Integer> st = new Stack<>();
        while (q.size() > 0) {
            st.push(q.remove());
        }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        System.out.println(q);
    }
}