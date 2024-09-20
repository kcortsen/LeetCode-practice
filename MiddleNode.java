public class MiddleNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }
        current = head;
        for (int i = 0; i < count / 2; i++) {
            current = current.next;
        }
        return current;
    }
}

