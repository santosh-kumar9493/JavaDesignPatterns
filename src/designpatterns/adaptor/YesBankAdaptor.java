package designpatterns.adaptor;

public class YesBankAdaptor implements BankAPI{
    YesBank yesBank = new YesBank();
    @Override
    public boolean makePayment(String from, String to, double amount) {
        //here we call corrosponding methods that make payment in yesbank object;
        System.out.println("Makking payment");
        return false;
    }

    @Override
    public double getBalance(String account) {
        //here we call corrosponding methods that gets the balance from yesbank object;
        System.out.println("getting balance");
        return 0;
    }
}
