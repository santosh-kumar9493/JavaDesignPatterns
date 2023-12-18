package designpatterns.adaptor;

public interface BankAPI {
    boolean makePayment(String from,String to,double amount);
    double getBalance(String account);
}
