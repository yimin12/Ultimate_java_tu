package AGenius.Java.Algorithm.DataStructure.LinkedList;


/**
 * Component of Linked List, the following are cheat sheet of linked list
 * Time Complexity of operation:
 *      Look Up -- O(n)
 *      Insert  -- O(1)
 *      Delete  -- O(1)
 *      Append  -- O(1)
 *      Prepend -- O(1)
 * @param <T>
 */
public class ListNode<T extends Comparable<T>> {

    T value;
    ListNode next;
    public ListNode(T value) {
        this.value = value;
        this.next = null;
    }
}
