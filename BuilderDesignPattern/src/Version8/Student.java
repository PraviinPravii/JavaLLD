package BuilderDesignPattern.src.Version8;

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

    private Student(Builder bldr){

        this.age=bldr.age;
        this.psp=bldr.psp;
        this.name=bldr.name;
        this.email=bldr.email;
        this.phonenum=bldr.phonenum;
    }
    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        int age;
        int psp;
        String name;
        String email;
        String phonenum;

        public Student build(){
            if(this.age<0 || this.age>120){
                throw new IllegalArgumentException("Age Should be between 0 to 120");
            }
            this.age=this.age;

            if(this.psp<0 || this.psp>100){
                throw new IllegalArgumentException("Age Should be between 0 to 120");
            }
            this.psp=this.psp;
            this.name=this.name;
            this.email=this.email;
            this.phonenum=this.phonenum;

            return new Builder(this);
        }
    }

}
