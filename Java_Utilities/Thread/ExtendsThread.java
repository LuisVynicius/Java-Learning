package Java_Utilities.Thread;

public class ExtendsThread extends Thread{
    
    public ExtendsThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        final String phrase = "Inside" + Thread.currentThread().getName();
        for (int i=0; i<5; i++) {
            System.out.println(phrase);
        }
    }

}
