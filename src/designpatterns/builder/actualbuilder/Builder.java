package designpatterns.builder.actualbuilder;

import javax.swing.plaf.basic.BasicDesktopIconUI;

public class Builder {
    private String name;
    private int age;
    private int year;
    private int marks;
    private String rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYear() {
        return year;
    }

    public int getMarks() {
        return marks;
    }

    public String getRollNo() {
        return rollNo;
    }

    public static Builder getBuilder(){
        return new Builder();
    }
}
