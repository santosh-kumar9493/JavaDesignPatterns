package designpatterns.prototype;

//Basic idea to store the protypes of obejcts in registry
/*
This objects in registry has some attribute already populated
so when we create an object we get protoype object and create a clone of it
on the clonned object we add the extra fields to it.
 */
public class Client {
    public static void fillRegistry(StudentRegistry sr){
        Student st= new Student();
        st.setBatch("sep2022");
        st.setYop("2022");
        sr.registerPrototype("Sep2022",st);

        Student is = new IntellijentStudent();
        is.setYop("2023");
        is.setBatch("intelbatch");
        sr.registerPrototype("intell",is);

    }
    public static void main(String[] args) {
        StudentRegistry sr = new StudentRegistry();
        fillRegistry(sr);
        Student santosh = sr.getPrototype("Sep2022").clone();
        santosh.setName("santosh");

        IntellijentStudent is = (IntellijentStudent) sr.getPrototype("intell").clone();
        System.out.println("DEBUG");


    }
}
