package BuilderDesignPattern.src.Version7;

public class Builder {
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

        return new Student(this);
    }
}
