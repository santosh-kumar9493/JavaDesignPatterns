package designpatterns.singleton.firstapproach;

public class DBConnection {
    private static DBConnection instance;
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        if(instance==null){
            instance = new DBConnection();
        }
        return instance;
    }
}

/*
Issues: This will not work for multithreaded environment

if thread T1,T2 are at line 9 at same time
then two objects will be created in total
 */
