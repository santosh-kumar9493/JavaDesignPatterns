package designpatterns.adaptor;

public class ICICIAdaptor implements BankAPI{
    ICICIBank iciciBank = new ICICIBank();
    @Override
    public boolean makePayment(String from, String to, double amount) {
        //here we call corrosponding methods that make payment in icici object;
        System.out.println("making payment from icici bank");
        return false;
    }

    @Override
    public double getBalance(String account) {
        //here we call corrosponding methods that gets the balance from icici object;
        System.out.println("getting balance from icici bank");
        return 0;
    }
}
