package designpatterns.builder.productioncodebuilder;

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

    private Student(Builder helper){
        //validations start
        this.name = helper.getName();
        if(helper.getAge()<18){
            // throw new Exception("This is for age 18 and above");
        }
        //validations end
        this.age = helper.getAge();
        this.year = helper.getYear();
        this.marks = helper.getMarks();
        this.rollNo = helper.getRollNo();
    }
    static class Builder {
        private String name;
        private int age;
        private int year;
        private int marks;
        private String rollNo;

        private Builder(){}

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setMarks(int marks) {
            this.marks = marks;
            return this;
        }

        public Builder setRollNo(String rollNo) {
            this.rollNo = rollNo;
            return this;
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
        public Student build(){
            return new Student(this);
        }

    }
    public static Builder getBuilder(){
        return new Builder();
    }
}
