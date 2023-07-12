package BuilderDesignPattern.src.Version6;

public class Student {
    private int age;
    private int psp;
    private String name;
    private String email;
    private String phonenum;

    public int getAge() {
        return age;
    }

    public int getPsg() {
        return psp;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenum() {
        return phonenum;
    }
    public Student(Builder bldr){
        if(bldr.age<0 || bldr.age>120){
            throw new IllegalArgumentException("Age Should be between 0 to 120");
        }
        this.age=bldr.age;

        if(bldr.psp<0 || bldr.psp>100){
            throw new IllegalArgumentException("Age Should be between 0 to 120");
        }
        this.psp=bldr.psp;
        this.name=bldr.name;
        this.email=bldr.email;
        this.phonenum=bldr.phonenum;
    }
    public static Builder getBuilder(){
        return new Builder();
    }

}
