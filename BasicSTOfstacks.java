import java.util.*;
public class BasicSTOfstacks{
    public static void main (String[] args){
        
        Stack<String> st = new Stack<>();
        //st.pop(); // under flow like empty sack
        //System.out.println("Empty"); true or false 

        st.push("sachin");
        st.push("abhishek");
        st.push("shubh");
        System.out.println(st.size());
        System.out.println("st");
        st.pop();
        System.out.println(st+" "+st.size());
    }
}