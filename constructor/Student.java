package constructor;

import java.util.jar.Attributes.Name;

public class Student {
    static String dept;
    int age;
    int roll;
    String name;
    int marks;

    Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    Student(String name,int age){
        this.age=age;   
        this.name=name;
    }

    Student(Student h,String name){
        // this(h.age, h.name);
        h.name=name;
        this.name=h.name;
        this.age=h.age; 
    }
    static void priii(){
        System.out.println(dept);
        System.out.println(Student.dept);
        
    }

    void print(){
        System.out.println(this.age);
        System.out.println(this.name);
        
        System.out.println(dept);
    }   
}
