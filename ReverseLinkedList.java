class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; 
            curr.next = prev;        
            prev = curr;              
            curr = next;              
        }

        return prev; 
    }

    // Display function
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);

        a.next = b;
        b.next = c;
        c.next = d;

     
        printList(a);

        ListNode newHead = reverseList(a);

        System.out.print("Reversed: ");
        printList(newHead);
    }
}