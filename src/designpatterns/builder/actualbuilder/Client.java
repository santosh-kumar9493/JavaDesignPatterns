package designpatterns.builder.actualbuilder;

// This the exact builder pattern , but in production code there is some enhancement made to it.
public class Client {
    public static void main(String[] args) {
        Builder helper = new Builder();
        helper.setAge(19);
        helper.setName("Santosh");
        helper.setMarks(100);
        helper.setRollNo("134");
        helper.setYear(2023);

        Student student = new Student(helper);

        System.out.print("DEBUG");
    }
}
