package _206_Reverse_Linked_List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by muscaestar on 3/2/20
 *
 * @author muscaestar
 */
public class _206Test {

    private Solution s;

    @Before
    public void setup() {
        s = new Solution();
    }

    @Test
    public void reverseList_iterative() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        // { 1 2 3 4 }
        ListNode newHead = s.reverseList_iterative(head);
//        System.out.println(linkListToString(newHead));
        assertEquals("{ 4 3 2 1 }", linkListToString(newHead));
    }

    @Test
    public void reverseList_iterative_single() {
        ListNode head = new ListNode(1);
        // { 1 }
        ListNode newHead = s.reverseList_iterative(head);
//        System.out.println(linkListToString(newHead));
        assertEquals("{ 1 }", linkListToString(newHead));
    }

    @Test
    public void reverseList_iterative_null() {
        ListNode head = null;
        // { }
        ListNode newHead = s.reverseList_iterative(head);
//        System.out.println(linkListToString(newHead));
        assertEquals("{ }", linkListToString(newHead));
    }

    @Test
    public void reverseList_recursive() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        // { 1 2 3 4 }
        ListNode newHead = s.reverseList_recursive(head);
//        System.out.println(linkListToString(newHead));
        assertEquals("{ 4 3 2 1 }", linkListToString(newHead));
    }

    @Test
    public void reverseList_recursive_single() {
        ListNode head = new ListNode(1);
        // { 1 }
        ListNode newHead = s.reverseList_recursive(head);
//        System.out.println(linkListToString(newHead));
        assertEquals("{ 1 }", linkListToString(newHead));
    }

    @Test
    public void reverseList_recursive_null() {
        ListNode head = null;
        // { }
        ListNode newHead = s.reverseList_recursive(head);
//        System.out.println(linkListToString(newHead));
        assertEquals("{ }", linkListToString(newHead));
    }

    public String linkListToString(ListNode head) {
        StringBuilder builder = new StringBuilder("{ ");
        while (head != null) {
            builder.append(head.val).append(" ");
            head = head.next;
        }
        builder.append("}");
        return builder.toString();
    }
}