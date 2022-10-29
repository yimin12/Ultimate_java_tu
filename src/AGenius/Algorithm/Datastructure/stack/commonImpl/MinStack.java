package AGenius.Algorithm.Datastructure.stack.commonImpl;

import java.util.ArrayDeque;
import java.util.Deque;

public interface MinStack {
    void push(int num);
    int pop();
    int min();
    boolean isEmpty();
}

class MinStackImpl_1 implements MinStack {

    /**
     * More space, less time
     * Space Complexity: O(n)
     * Time Complexity:
     *      pop -- O(1)
     *      min -- O(1)
     *      push -- O(1)
     */
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStackImpl_1() {
        this.stack = new ArrayDeque<Integer>();
        this.minStack = new ArrayDeque<Integer>();
    }

    @Override
    public void push(int num) {
        stack.push(num); // no matter what happen, just add
        if (minStack.isEmpty()) {
            minStack.push(num);
        } else {
            minStack.push(Math.min(minStack.peek(), num));
        }
    }

    @Override
    public int pop() {
        minStack.pop();
        return stack.pop();
    }

    @Override
    public int min() {
        return minStack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

class MinStackImpl_2 implements MinStack {

    /**
     * More space, less time
     * Space Complexity: O(n) but save more space compare to MinStackImpl_1
     * Time Complexity:
     *      pop -- O(1)
     *      min -- O(1)
     *      push -- O(1)
     */
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStackImpl_2() {
        this.stack = new ArrayDeque<Integer>();
        this.minStack = new ArrayDeque<Integer>();
    }

    @Override
    public void push(int num) {
        stack.push(num);
        if (minStack.isEmpty()) minStack.push(num);
        else if (minStack.peek() >= num) minStack.push(num);
    }

    @Override
    public int pop() {
        if(stack.peek().equals(minStack.peek())) minStack.pop();
        return stack.pop();
    }

    @Override
    public int min() {
        return minStack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

class Main_MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStackImpl_2();
        minStack.push(3);
        minStack.push(2);
        minStack.push(1);
        minStack.push(7);
        minStack.push(6);
        minStack.push(5);
        while(!minStack.isEmpty()) {
            System.out.println(minStack.min());
            minStack.pop();
        }

    }
}
