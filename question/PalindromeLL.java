public class PalindromeLL {
    public static void main(String[] args) {
        // Create a palindrome linked list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        PalindromeLL p = new PalindromeLL();
        boolean result = p.isPalindrome(head);
        System.out.println("Is Palindrome: " + result);
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        // Find middle using slow and fast pointer
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        ListNode temp1 = head;
        ListNode temp2 = reverseHalfNode(slow);

        // Compare first half with reversed second half
        while (temp2 != null) {
            if (temp1.val != temp2.val) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }

    public ListNode reverseHalfNode(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode;

        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
