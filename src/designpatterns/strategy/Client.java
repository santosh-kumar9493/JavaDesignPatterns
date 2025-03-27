package designpatterns.strategy;

/*
The Strategy Pattern is a design pattern that allows you to define a family of algorithms,
 encapsulate each one, and make them interchangeable. This pattern lets you choose the algorithm 
 or behavior to use at runtime without changing the code that uses it.

 when to use?

 You have multiple ways of doing something, like different algorithms or behaviors, 
 and want to choose between them dynamically.

You want to avoid using a lot of conditional logic (like if/else or switch statements).
 The Strategy Pattern organizes the behavior into separate classes, so it’s cleaner and more 
 flexible.

You want to make your code more maintainable and extensible. When you need to add a new way 
of doing something (like a new delivery method), you can just create a new strategy, and the 
rest of the code doesn’t need to change.

*/

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("A","B","train");
    }
}

/*
In the above example , in google maps shows different stratagies to reach destination,
each path  by car,train,walk is strategy to reach destination.

we decide the type of strategy to use by the input from the client class.
 */