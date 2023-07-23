package LectureJavaStreams.FunctionalInterface;

public class Client {
    public static void main(String[] args) {
//        System.out.println("Hello");

        Demointerface way1=new Demoimplementationinterface();
        way1.fun();

    }
    Demointerface way2=new Demointerface() {
        @Override
        public void fun() {
            System.out.println("Way to anonymous class way");
        }

    };
//    way2.fun();

}
