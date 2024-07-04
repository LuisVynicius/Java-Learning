package Java_Utilities.Thread;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        /*Thread thread01 = new ExtendsThread("Carlinhos");
        Thread thread02 = new Thread(new ImplementationThread());
        Thread thread03 = new Thread(() -> {
            final String phrase = "Inside" + Thread.currentThread().getName();
            for (int i=0; i<5; i++) {
                System.out.println(phrase);
            }
        });

        thread01.setDaemon(true);
       
        thread01.start();
        thread02.start();
        thread03.start();

        */
        /*
        Stack stack = new Stack(5);
        
        new Thread(() -> {
            int counter = 0;
            while (++counter < 10){
                System.out.println("Pushed: " + stack.push(100));
            }
        }, "Pushed").start();
        new Thread(() -> {
            int counter = 0;
            while (++counter < 10){
                System.out.println("Popped: " + stack.pop());
            }
        }, "Popped").start();
         */
        /*
        BlockingQueue blockingQueue = new BlockingQueue(5);
        Thread thread01 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                blockingQueue.add(i);
            }
        });
        Thread thread02 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                blockingQueue.remove();
            }
        });

        thread01.setPriority(7);

        thread01.start();
        thread02.start();

        thread01.join();
        thread02.join();
        
        System.out.println("Main is exiting. ");
        System.out.println(blockingQueue.queue.size());
        blockingQueue.queue.forEach(System.out::println);
        */
        /*
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1);
                for (int i = 0; i < 100; i++) {
                    
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        thread.start();
        while (true) {
            System.out.println(thread.getState());
            if (thread.getState()==Thread.State.TERMINATED) {
                
            System.out.println(thread.getState());
            break;
            }
        }
        */
        // DeadLock
        Object lock01 = new Object();
        Object lock02 = new Object();

        Thread thread01 = new Thread(() -> {
            synchronized(lock01) {
                try { Thread.sleep(1); } catch (InterruptedException e) {}
                
                synchronized(lock02) {
                    System.out.println("Liberado01");
                }
            }
        }); 
        Thread thread02 = new Thread(() -> {
            synchronized(lock02) {
                try { Thread.sleep(1); } catch (InterruptedException e) {}
                
                synchronized(lock01) {
                    System.out.println("Liberado02");
                }
            }
        }); 
        
        thread01.start();
        thread02.start();
    }

}
