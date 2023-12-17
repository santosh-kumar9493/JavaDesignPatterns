package designpatterns.singleton.doublechecklocking;

public class DBConnection {
    private static DBConnection instance ;
    private DBConnection(String s){
    }
    public static DBConnection getInstance(String s){
        if(instance==null){
            synchronized (DBConnection.class) {
                if(instance==null) {
                    instance = new DBConnection(s);
                }
            }
        }
        return instance;
    }
}

/*
works well with multi threaded environment in case if we want to pass some parameter inside constructor
This is called double checking
 */
