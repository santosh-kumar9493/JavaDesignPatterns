package designpatterns.singleton.synchronisedway;

public class DBConnection {
    private static DBConnection instance ;
    private DBConnection(String s){
    }
    public static synchronized DBConnection getInstance(String s){
        if(instance==null){
            instance = new DBConnection(s);
        }
        return instance;
    }
}

/*
works well with multi threaded environment in case if we want to pass some parameter inside constructor
Issues:
1.Very slow as this works in sequential manner
 */
