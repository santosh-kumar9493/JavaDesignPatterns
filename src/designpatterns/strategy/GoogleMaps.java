package designpatterns.strategy;

public class GoogleMaps {
    void findPath(String from,String to,String mode){
        PathCalculatorStrategy pathCalculatorStrategy= PathCalculatorFactory.getModeOfCalculator(mode);
        pathCalculatorStrategy.findPath(from,to);
    }
}
