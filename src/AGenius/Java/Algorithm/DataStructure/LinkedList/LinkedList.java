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
public interface LinkedList <T extends Comparable<T>>{
    ListNode<T> search(T value);
    ListNode<T> getMiddle();
    ListNode<T> delete(T value);
}
