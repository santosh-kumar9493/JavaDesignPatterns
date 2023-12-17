package atomicDataTypes;



public class Adder implements Runnable{
    Count count;
    Adder(Count c){
        this.count=c;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            this.count.val.addAndGet(i);
        }

    }
}
