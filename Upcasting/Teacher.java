package Upcasting;

public class Teacher extends Student {

    String subject;
    String name;

    void printt() {
        System.out.println(this.subject);
        System.out.println(this.name);
    }
}
