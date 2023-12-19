package designpatterns.strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String To) {
        System.out.println("Walk Path");
    }
}
