package Example;

public class Client {
    public static void main(String[] args) {
        Student s1=new Student(10,"Hello");
        Student s2=new Student(32,"DEF");
        Student.School_name="DAV";
        System.out.println(s1.School_name);
        s1.School_name="ABC";
        System.out.println(s2.School_name);

    }
}
