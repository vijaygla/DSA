public class IntersectionOfTwoLinkedList {
    
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to find intersection node
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        return pointerA; // Returns intersection node or null
    }

    // Helper method to create a linked list
    public static ListNode createLinkedList(int[] values) {
        ListNode head = null;
        ListNode tail = null;

        for (int value : values) {
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Helper method to connect two lists at the intersection point
    public static void connectLists(ListNode listA, ListNode listB, int intersectionValue) {
        ListNode intersectionNode = null;

        // Find intersection node in listA
        ListNode currentA = listA;
        while (currentA != null) {
            if (currentA.data == intersectionValue) {
                intersectionNode = currentA;
                break;
            }
            currentA = currentA.next;
        }

        // Attach intersection node to the end of listB
        if (intersectionNode != null) {
            ListNode currentB = listB;
            while (currentB.next != null) {
                currentB = currentB.next;
            }
            currentB.next = intersectionNode;
        }
    }

    public static void main(String[] args) {
        int intersectVal = 8;
        int[] listAValues = { 4, 1, 8, 4, 5 };
        int[] listBValues = { 5, 6, 1 };

        // Create linked lists
        ListNode listA = createLinkedList(listAValues);
        ListNode listB = createLinkedList(listBValues);

        // Connect lists at the intersection value
        connectLists(listA, listB, intersectVal);

        // Find intersection node
        IntersectionOfTwoLinkedList solution = new IntersectionOfTwoLinkedList();
        ListNode intersection = solution.getIntersectionNode(listA, listB);

        if (intersection != null) {
            System.out.println("Intersected at '" + intersection.data + "'");
        } else {
            System.out.println("No intersection");
        }
    }
}

