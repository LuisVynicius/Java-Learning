package Java_Utilities.Thread;

public class Stack {

    private int[] array;
    private int stackTop;
    Object lock;

    public Stack(int capacity) {
        this.array = new int[capacity];
    }

    public synchronized boolean push(int element) {
        //synchronized(this) {
            if (isFull()) return false;
            ++ stackTop;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
    
            }
            array[stackTop] = element;
            return true;
        //}
    }

    public synchronized int pop() {
        //synchronized(this) {
            if (isEmpty()) return Integer.MIN_VALUE;
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;
            try { Thread.sleep(1000); } catch (Exception e) {}
            stackTop--;
            return obj;
        //}
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop == array.length-1;
    }
}
