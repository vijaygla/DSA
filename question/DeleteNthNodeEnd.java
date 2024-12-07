public class DeleteNthNodeEnd {

  static class Node {
    int val;
    Node next;

    Node(int val) {
      this.val = val;
      this.next = null;
    }
  }

  private static Node deleteNthNodeEnd(Node head, int n) {
    Node curr = head;
    int count = 0;

    while (curr != null) {
      count++;
      curr = curr.next;
    }

    int step = count - n;
    if (step == 0)
      return head.next;

    curr = head;
    for (int i = 0; i < step; i++) {
      curr = curr.next;
    }
    curr.next = curr.next.next;
    return head;
  }

  private static void printLL(Node head) {
    Node curr = head;

    while (curr != null) {
      System.out.print(curr.val + " ");
      curr = curr.next;
    }
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    printLL(deleteNthNodeEnd(head, 2));
  }
}
