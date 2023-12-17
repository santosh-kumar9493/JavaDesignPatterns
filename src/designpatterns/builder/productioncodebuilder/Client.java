package designpatterns.builder.productioncodebuilder;

// This builder pattern code used in production code
/*
Attributes are set in builder using the attribute chaining.
we dont want any one to access the student,builder  construcor so we move the builder class to student

 */
public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder().setAge(19)
                .setName("Santosh")
                .setMarks(100)
                .setRollNo("134")
                .setYear(2023).build();


        System.out.print("DEBUG");
    }
}
