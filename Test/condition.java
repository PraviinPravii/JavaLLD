import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        
      
  
    Scanner s=new Scanner(System.in);
    char operator=s.next().charAt(0);
    System.out.println("enter a");
    int a=s.nextInt();
    System.out.println("enter b");
    int b=s.nextInt();

    switch(operator){
        case '+':
            System.out.println(a+b);
            break;
        case '-':
            System.out.println(a-b);
            break;
        case '/':
            System.out.println(a/b);
            break;
        case '*':
            System.out.println(a*b);
            break;
    }
    }   
    
}
