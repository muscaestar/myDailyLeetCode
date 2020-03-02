package _206_Reverse_Linked_List;

/**
 * Created by muscaestar on 3/2/20
 *
 * @author muscaestar
 */
class Solution {
    public ListNode reverseList_iterative(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;

            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public ListNode reverseList_recursive(ListNode head) {
        return reverseList_recursive(null, head);
    }

    private ListNode reverseList_recursive(ListNode prev, ListNode curr) {
        if (curr == null) {
            return prev;
        }
        ListNode temp = curr.next;
        curr.next = prev;
        return reverseList_recursive(curr, temp);
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

