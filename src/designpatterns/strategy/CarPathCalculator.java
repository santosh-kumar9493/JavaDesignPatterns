package designpatterns.strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String To) {
        System.out.println("Car Path");
    }
}
