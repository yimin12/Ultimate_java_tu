package AGenius.Algorithm.DataStructure.LinkedList;

import java.util.List;

/**
 * Reverse Linked List (or ListNode) series
 * LeetCode : 206, 92, 25
 */
public class ReverseLinkedList {

    /**
     * For any interviewer, they hope you can reverse a linked list in recursive way and iterative way
     * Both solution should be O(n) time, but O(n) space for recursive (stack frame) and O(1) for iterative (in heap)
     */
    public ListNode reverseLinkedListIter(ListNode head) {
        // Sanity check
        if (head == null || head.next == null) return head;
        ListNode prev = null, next;
        // Pointer switch
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public ListNode reverseLinkedListRecur(ListNode head) {
        // Base case / Function exit
        if (head == null || head.next == null) return head;
        // Divide and Conquer
        ListNode newHead = reverseLinkedListRecur(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * Same context with the previous question, reverse the linked list in pair
     * Example : 1 -> 2 -> 3 -> 4  --> 2 -> 1 -> 4 -> 3
     * Implement it in recursive way and iterative way
     * Both solution should be O(n) time, but O(n) space for recursive (stack frame) and O(1) for iterative (in heap)
     * @param head
     * @return
     */
    public ListNode reverseLinkedListInPairIter(ListNode head) {
        if (head == null || head.next == null) return head;
        // Assume all given input is positive value
        ListNode dummy = new ListNode(-1), cur = dummy, next;
        dummy.next = head;
        while (cur.next != null && cur.next.next != null) {
            // cur is dummy for each pair
            next = cur.next.next;
            cur.next.next = next.next;
            next.next = cur.next;
            cur.next = next;
            cur = cur.next.next;
        }
        return dummy.next;
    }

    // hard to think? Still divide and conquer
    public ListNode revereLinkedListInPairRecur(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = head.next;
        head.next = revereLinkedListInPairRecur(head.next.next);
        newHead.next = head;
        return newHead;
    }

    /**
     * Reverse Linked List in specific range
     * You do not have to implement the recursive way, because it just simply find the right left boundary and
     * apply reverse, Nothing special. Just Iterative way. O(n) time worst case, should be O(right) time and O(1) space
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseLinkedListInRangeIter(ListNode head, int left, int right) {
        if (head == null) return head;
        // step 1: find the left boundary
        ListNode dummy = new ListNode(-1), cur = dummy;
        dummy.next = head;
        int i;
        for (i = 0; i < left && cur.next != null; i ++) {
            cur = cur.next;
        }
        // Corner case 1: if the length of head is shorter than left, just return original head
        if (i != left) return dummy.next;
        ListNode start = cur.next, next = start.next;
        for (i = 0; i < right - left && start != null && next != null; i ++) {
            start.next = next.next;
            next.next = cur.next;
            cur.next = next;
            next = start.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ReverseLinkedList test = new ReverseLinkedList();
        ListNode<Integer> one = new ListNode<>(1);
        ListNode<Integer> two = new ListNode<>(2);
        ListNode<Integer> three = new ListNode<>(3);
        ListNode<Integer> four = new ListNode<>(4);
        ListNode<Integer> five = new ListNode<>(5);
        ListNode<Integer> six = new ListNode<>(6);
        ListNode<Integer> seven = new ListNode<>(7);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
//        ListNode<Integer> temp = test.revereLinkedListInPairRecur(one);
//        while(temp.next != null) {
//            System.out.println(temp.value);
//            temp = temp.next;
//        }

        ListNode temp2 = test.reverseLinkedListInRangeIter(one, 2, 4);
        while(temp2.next != null) {
            System.out.println(temp2.value);
            temp2 = temp2.next;
        }
    }
}
