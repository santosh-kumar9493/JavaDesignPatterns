package designpatterns.prototype;

public class IntellijentStudent extends Student{
    private int iq;
    IntellijentStudent(){}
    IntellijentStudent(IntellijentStudent s){
        super(s);
        this.iq=s.iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
    @Override
    public Student clone(){
        return new IntellijentStudent(this);
    }
}
