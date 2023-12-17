package atomicDataTypes;



public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count c =new Count();
        Adder adder = new Adder(c);
        Subtractor subs = new Subtractor(c);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subs);

        t1.start();
        t2.start();
        System.out.print(c.val);
    }
}
