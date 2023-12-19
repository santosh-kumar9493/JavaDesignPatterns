package designpatterns.strategy;

public class PathCalculatorFactory {
    private static PathCalculatorStrategy carPathCalculator= new CarPathCalculator();
    private static PathCalculatorStrategy walkPathCalculator= new WalkPathCalculator();
    private static PathCalculatorStrategy trainPathCalculator= new TrainPathCalculator();
    static PathCalculatorStrategy getModeOfCalculator(String mode){
        if(mode.equals("car")){
            return carPathCalculator;
        }
        else if(mode.equals("walk")){
            return walkPathCalculator;
        }
        else if(mode.equals("train")){
            return trainPathCalculator;
        }
        return null;
    }
}
