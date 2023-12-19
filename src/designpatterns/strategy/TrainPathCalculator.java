package designpatterns.strategy;

public class TrainPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String To) {
        System.out.println("Train Path");
    }
}
