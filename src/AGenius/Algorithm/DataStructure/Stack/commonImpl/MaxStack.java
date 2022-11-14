package AGenius.Algorithm.DataStructure.Stack.commonImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public interface MaxStack <T extends Comparable<T>> {
    void push(T value);
    T pop();
    T top();
    T peekMax();
    T popMax();
    boolean isEmpty();
}

/**
 * You can maintain two stacks like the MinStack does, here I want to use other methods
 */
class MaxStack_Impl<T extends Comparable<T>> implements MaxStack<T> {

    /**
     * We maintain the treemap to sort these values from small to large
     * We maintain the double linked list to conveniently insert and delete
     * Space: O(n)
     * Time: push -- O(1)
     *       pop -- O(1)
     *       peekMax -- O(logN)
     *       popMax -- O(logN)
     * @param <T>
     */
    class Node <T> {
        T value;
        Node<T> prev, next;
        public Node(T val) {
            this.value = val;
        }
    }

    class DoubleLinkedList<T> {
        Node<T> head, tail;
        Integer length;
        public DoubleLinkedList() {
            head = new Node(0);
            tail = new Node(0);
            head.next = tail;
            tail.prev = head;
            length = 0;
        }
        public Node add(T value) {
            Node<T> x = new Node(value);
            x.next = tail;
            x.prev = head;
            tail.prev = x;
            this.length ++;
            return x;
        }
        public T pop() {
            return unlink(tail.prev).value;
        }
        public T peek() {
            return tail.prev.value;
        }
        public Node<T> unlink(Node node) {
            this.length --;
            node.prev.next = node.next;
            node.next.prev = node.prev;
            return node;
        }
        public boolean isEmpty() {
            return this.length == 0;
        }
     }

    TreeMap<T, List<Node<T>>> map; // min heap
    DoubleLinkedList<T> doubleLinkedList;
    public MaxStack_Impl() {
        this.map = new TreeMap<>();
        this.doubleLinkedList = new DoubleLinkedList<>();
    }

    @Override
    public void push(T value) {
        Node<T> node = doubleLinkedList.add(value);
        if (!map.containsKey(value)) {
           map.put(value, new ArrayList<>());
        }
        map.get(value).add(node);
    }

    @Override
    public T pop() {
        return doubleLinkedList.peek();
    }

    @Override
    public T top() {
        return doubleLinkedList.peek();
    }

    @Override
    public T peekMax() {
        return map.lastKey();
    }

    @Override
    public T popMax() {
        T max = peekMax();
        List<Node<T>> cur = map.get(max);
        Node<T> node = cur.remove(cur.size() - 1); // If there is duplicate, remove the newest one
        doubleLinkedList.unlink(node);
        if(cur.isEmpty()) map.remove(max);
        return max;
    }

    @Override
    public boolean isEmpty() {
        return doubleLinkedList.isEmpty();
    }
}

class Main_MaxStack {
    public static void main(String[] args) {
        MaxStack<Integer> maxStack = new MaxStack_Impl<>();
        maxStack.push(1);
        maxStack.push(4);
        maxStack.push(7);
        maxStack.push(2);
        maxStack.push(5);
        maxStack.push(9);
        maxStack.push(11);
        while (!maxStack.isEmpty()) {
            System.out.println(maxStack.popMax());
        }
    }
}
