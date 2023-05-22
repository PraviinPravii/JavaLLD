import java.util.Scanner;

public class function {

    public static void print_name(String name) {

        System.out.println(name);
        
    }
    public static int sum(int a,int b) {
        
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String name=sc.next();
        // print_name(name);
        int a=sc.nextInt();
        int b=sc.nextInt(); 
        System.out.println(sum(a, b));

    }
    
}
