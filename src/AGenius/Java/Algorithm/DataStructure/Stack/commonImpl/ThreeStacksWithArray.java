package AGenius.Java.Algorithm.DataStructure.Stack.commonImpl;

/**
 * Implement three stacks by a single array.
 *
 * You can assume the three stacks has the same size and big enough, you don't need to care about how to extend it if
 * one of the stack is full.
 * Example:
 *      ThreeStacks(5)  // create 3 stacks with size 5 in single array. stack index from 0 to 2
 *      push(0, 10) // push 10 in the 1st stack.
 *      push(0, 11)
 *      push(1, 20) // push 20 in the 2nd stack.
 *      push(1, 21)
 *      pop(0) // return 11
 *      pop(1) // return 21
 *      peek(1) // return 20
 *      push(2, 30)  // push 30 in the 3rd stack.
 *      pop(2) // return 30
 *      isEmpty(2) // return true
 *      isEmpty(0) // return false
 */
public interface ThreeStacksWithArray <T extends Comparable<T>> {
    void push(int index, T value);
    T pop(int index);
    T peek(int index);
    boolean isEmpty(int index);
}

class TreeStacksWithArrayImpl <T extends Comparable<T>> implements ThreeStacksWithArray<T> {

    class Pair<T> {
        private int stack;
        private T num;
        public Pair(int stack, T num) {
            this.stack = stack;
            this.num = num;
        }
    }
    private Pair[] array;
    private int[] pointers, sizes;
    public TreeStacksWithArrayImpl(int size) {
        array = new Pair[size * 3];
        pointers = new int[3];
        sizes = new int[3];
        for (int i = 0; i < 3; i++) {
            pointers[i] = -1;
        }
    }

    @Override
    public void push(int index, T value) {
        int p = pointers[index];
        p ++;
        while (p < array.length && array[p] != null) {
            p ++;
        }
        array[p] = new Pair(index, value);
        sizes[index] ++;
        pointers[index] = p;
    }

    @Override
    public T pop(int index) {
        Pair res = null;
        int p = pointers[index];
        if (!isEmpty(index)) {
            res = array[p];
            array[p--] = null;
            sizes[index] --;
            while (p >= 0 && (array[p] == null || array[p].stack != index)) {
                p --;
            }
        }
        pointers[index] = p;
        if (res != null) {
            return (T) res.num;
        }
        return null;
    }

    @Override
    public T peek(int index) {
        int p = pointers[index];
        if (p != -1) {
            return (T) array[p].num;
        }
        return null;
    }

    @Override
    public boolean isEmpty(int index) {
        return sizes[index] == 0;
    }
}
