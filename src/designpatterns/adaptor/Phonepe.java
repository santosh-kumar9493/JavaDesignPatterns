package designpatterns.adaptor;

public class Phonepe {
    BankAPI bankAPI;
    Phonepe(BankAPI bankAPI){
        this.bankAPI=bankAPI;
    }
    public static void main(String[] args) {
        //In client class we set the type of bank with dependecny injection
        Phonepe phonepe=new Phonepe(new ICICIAdaptor());
        phonepe.bankAPI.getBalance("12");
        phonepe.bankAPI.makePayment("12","34",123);
    }
}
