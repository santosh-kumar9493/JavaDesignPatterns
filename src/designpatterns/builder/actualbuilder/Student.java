package designpatterns.builder.actualbuilder;

/*
Builder pattern is used
1.If your class has too many attributes
2.If you class has validations for attributes.
 */
public class Student {
    private String name;
    private int age;
    private int year;
    private int marks;
    private String rollNo;

    public Student(Builder helper){
        this.name = helper.getName();
        if(helper.getAge()<18){
            // throw new Exception("This is for age 18 and above");
        }
        this.age = helper.getAge();
        this.year = helper.getYear();
        this.marks = helper.getMarks();
        this.rollNo = helper.getRollNo();
    }
}
