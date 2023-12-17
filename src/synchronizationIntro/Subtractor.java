package synchronizationIntro;

public class Subtractor implements Runnable{
    Count count;
    Subtractor(Count c){
        this.count=c;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            this.count.val-=i;
        }
    }
}
