package designpatterns.prototype;

public class Student implements Prototype<Student>{

    private String name;
    private String batch;
    private String yop;

    public Student() {
    }

    public Student(Student s) {
        this.name=s.name;
        this.batch=s.batch;
        this.yop=s.yop;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setYop(String yop) {
        this.yop = yop;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
