package synchronizationLocks;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count count;
    Lock lock;
    Subtractor(Count c, Lock lock){
        this.count=c;
        this.lock=lock;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            lock.lock();
            this.count.val-=i;
            lock.unlock();
        }
    }
}
