package semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{
    private Queue<Object> store;
    private int maxSize;
    private Lock lock;
    String name;
    private Semaphore producerSemaPhore;
    private Semaphore consumerSemaPhore;

    public Consumer(Queue<Object> store, int maxSize, Lock lock, Semaphore producerSemaPhore, Semaphore consumerSemaPhore,String name) {
        this.store = store;
        this.maxSize = maxSize;
        this.lock = lock;
        this.producerSemaPhore = producerSemaPhore;
        this.consumerSemaPhore = consumerSemaPhore;
        this.name=name;
    }
    @Override
    public void run() {
        while(true){
            try {
                consumerSemaPhore.acquire();
             //   lock.lock();
             //   if(store.size()>0){   // we dont need this as semphores has alraedy a check
                      System.out.println("Consumer "+name+" is consumer and size = "+store.size());
                    store.remove();
            //    }
            //    lock.unlock();
                producerSemaPhore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
