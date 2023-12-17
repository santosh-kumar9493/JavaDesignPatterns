package synchronizationLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count c =new Count();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(c,lock);
        Subtractor subs = new Subtractor(c,lock);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subs);

        t1.start();
        t2.start();
        System.out.print(c.val);
    }
}
