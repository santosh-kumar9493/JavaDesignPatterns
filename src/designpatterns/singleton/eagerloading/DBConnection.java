package designpatterns.singleton.eagerloading;

public class DBConnection {
    private static DBConnection instance = new DBConnection();
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        return instance;
    }
}

/*
works well with multi threaded environment.
Issues:
1. If there are more singleton classes like this , the application start will increase.
2. If we want to create DB object with parameterised constructor , as object is created at run time

 */
