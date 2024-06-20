package Java_Utilities.Reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Objects;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {

        //WeakReference
        Person person = new Person("User01", "Password01");
        ReferenceQueue<Person> rq = new ReferenceQueue<>();
        WeakReference<Person> wr = new WeakReference<>(person, rq);

        person = null;
        
        System.gc();

        //Wait gc
        Thread.sleep(1000);

        System.out.println("WeakReference: "  + ((wr.get()!=null)  ? "True" : "False"));
        System.out.println("ReferenceQueue: " + ((rq.poll()!=null) ? "True" : "False"));

        // SoftReference
        Person person2 = new Person("User02", "Password02");
        SoftReference<Person> sr = new SoftReference<>(person2);
        
        person2 = null;

        System.gc();

        System.out.println("SoftReference: " + ((sr.get()!=null) ? "True" : "False"));

        //PhantomReference
        Person person3 = new Person("User03", "Password03");
        ReferenceQueue<Person> rq2 = new ReferenceQueue<>();
        PhantomReference<Person> pr = new PhantomReference<>(person3, rq2);

        person3 = null;

        System.gc();

        //Wait gc
        Thread.sleep(1000);

        System.out.println("PhantomReference: " + ((rq2.poll()!=null) ? "True" : "False"));

    }

}

class Person {
    private String username;
    private String password;

    public Person() {
    }

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person username(String username) {
        setUsername(username);
        return this;
    }

    public Person password(String password) {
        setPassword(password);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(username, person.username) && Objects.equals(password, person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }
    
}