package AGenius.Algorithm.Datastructure.stack.commonImpl;

public interface MyStack <T extends Comparable<T>> {
    T pop();
    T peek();
    void push(T value);
    boolean isEmpty();
}

class MyStackImpl_LinkedList <T extends Comparable<T>> implements MyStack<T> {

    /**
     * User Linked List to implement the stack, you can use array, key inside: insert from the head
     * Space: O(n)
     * Time: all O(1)
     * @param <T>
     */
    class ListNode<T> {
        T value;
        private ListNode next;
        public ListNode(T val) {
            this.value = val;
        }
    }

    private ListNode<T> head;
    public MyStackImpl_LinkedList() {
        this.head = null; // dummy head
    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }
        ListNode<T> prev = head;
        head = head.next;
        prev.next = null;
        return prev.value;
    }

    @Override
    public T peek() {
        if (head == null) return null;
        return head.value;
    }

    @Override
    public void push(T ele) {
        if (head == null) {
            head = new ListNode(ele);
            return;
        }
        ListNode<T> node = new ListNode(ele);
        node.next = head;
        head = node;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }


}

class Main_MyStack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStackImpl_LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(16);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
