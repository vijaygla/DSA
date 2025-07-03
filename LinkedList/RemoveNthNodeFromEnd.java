public class RemoveNthNodeFromEnd {

    static class  ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n)  {
        int count = 0;
        ListNode curr = head;

        while(curr != null) {
            count++;
            curr = curr.next;
        }

        int step = count - n;

        if(step == 0) return head.next;

        curr = head;
        for(int i=1; i<step; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;

        while(curr != null) {
            System.out.print(curr.val);
            if(curr.next != null) System.out.print(" ---> ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        // Input: [1,2,3,4,5], n = 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);
        System.out.println();
        int n = 2;
        head = removeNthFromEnd(head, n);

        System.out.print("Modified List: ");
        printList(head); // Output: [1,2,3,5]
    }
}

