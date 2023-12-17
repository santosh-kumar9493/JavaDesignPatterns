package semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{
    private Queue<Object> store;
    private int maxSize;
    private Lock lock;
    private String name;

    public Producer(Queue<Object> store, int maxSize, Lock lock, Semaphore producerSemaPhore, Semaphore consumerSemaPhore,String name) {
        this.store = store;
        this.maxSize = maxSize;
        this.lock = lock;
        this.producerSemaPhore = producerSemaPhore;
        this.name=name;
        this.consumerSemaPhore = consumerSemaPhore;
    }

    private Semaphore producerSemaPhore;
    private Semaphore consumerSemaPhore;

    @Override
    public void run() {
        while(true){
            try {
                producerSemaPhore.acquire();
             //   lock.lock();
             //   if(store.size()<maxSize){ we dont need this as semphores has alraedy a check
                    System.out.println("Producer "+name+" is prodcuing and size = "+store.size());
                    store.add(new Object());
             //   }
              //  lock.unlock();
                consumerSemaPhore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
