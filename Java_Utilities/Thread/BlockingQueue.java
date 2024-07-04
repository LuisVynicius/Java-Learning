package Java_Utilities.Thread;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    public Queue<Integer> queue;
    private int capacity;

    public BlockingQueue(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }
    public boolean add(int item) {
        synchronized(queue) {
            while (queue.size() == capacity) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            queue.add(item);
            queue.notifyAll();
            return true;
        }
    }

    public int remove() {
        synchronized(queue) {
            while (queue.size() == 0) {
               try {
                queue.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            int element = queue.poll();
            queue.notifyAll(); 
            return element;
        }
    }
}
