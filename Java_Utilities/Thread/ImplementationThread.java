package Java_Utilities.Thread;

public class ImplementationThread implements Runnable{

    @Override
    public void run() {
        final String phrase = "Inside " + Thread.currentThread().getName();
        for (int i=0; i<5; i++) {
            System.out.println(phrase);
        }
    }
    
}
