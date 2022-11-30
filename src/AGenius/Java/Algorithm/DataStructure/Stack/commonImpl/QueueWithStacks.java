package AGenius.Java.Algorithm.DataStructure.Stack.commonImpl;

import java.util.ArrayDeque;
import java.util.Deque;

public interface QueueWithStacks<T extends Comparable<T>> {
    void push(T ele);
    T pop();
    T top();
    boolean isEmpty();
}

class QueueWithStacksImpl_1<T extends Comparable<T>> implements QueueWithStacks<T> {

    /**
     * Queue is FIFO and Stack is LIFO
     * Use one stack (stack2) as buffer to reverse the sequence, then it becomes FIFO
     * Space: O(n)
     * Time: shuffle -- worst case O(n)
     *       push -- O(1)
     *       pop -- worst case O(n), amortize O(1)
     *       top -- worst case O(n) , amortize O(1)
     */
    private Deque<T> stack1;
    private Deque<T> stack2;

    public QueueWithStacksImpl_1() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    /**
     * Shuffle from stack 2 to stack 1
     */
    private void shuffle() {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    @Override
    public void push(T ele) {
        stack2.push(ele);
    }

    @Override
    public T pop() {
        if (stack1.isEmpty()) {
            this.shuffle();
        }
        return stack1.pop();
    }

    @Override
    public T top() {
        if (stack1.isEmpty()) {
            this.shuffle();
        }
        return stack1.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

class Main_QueueWithStacks {
    public static void main(String[] args) {
        QueueWithStacks<Integer> queue = new QueueWithStacksImpl_1<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
    }
}