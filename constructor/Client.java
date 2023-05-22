package constructor;

public class Client {

    public static void main(String[] args) {
         Student st=new Student("Pravee",75 );
        st.dept="Electronic";
        // st.print();
        // Student h=st;
        // h.age=18;
        // st.print();
        Student hh=new Student(st,"Hello");
        // hh.print();
        Student.priii();
    }
    
}
