package designpatterns.prototype;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String,Student> map;
    StudentRegistry(){
        map=new HashMap<>();
    }
    public void registerPrototype(String key,Student value){
        this.map.put(key,value);
    }
    public Student getPrototype(String key){
        return this.map.get(key);
    }
}
