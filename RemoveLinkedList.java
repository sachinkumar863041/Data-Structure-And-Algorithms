import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveLinkedList {

    public static ListNode removeNodes(ListNode head) {

        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        // Process every node
        while (temp != null) {

            while (!st.isEmpty() && st.peek().val < temp.val) {
                st.pop();
            }

            st.push(temp);
            temp = temp.next;
        }

        // Rebuild the linked list
        temp = null;

        while (!st.isEmpty()) {

            ListNode top = st.pop();

            top.next = temp;
            temp = top;
        }

        return temp;
    }

    // Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // 5 -> 2 -> 13 -> 3 -> 8
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        System.out.println("Original List:");
        printList(head);

        head = removeNodes(head);

        System.out.println("After Removing Nodes:");
        printList(head);
    }
}