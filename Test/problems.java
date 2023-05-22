import java.util.Scanner;

public class problems {

    public static int sum_of_natural_number(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;

        
    }
    public static void table(int n) {
        int i=1;
        while (i<=10){

            System.out.print(n);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(n*i);
            i++;
        }
         
    }
    public static void patern(int row,int col) {
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
    public static void hollo(int row,int col) {
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (i==0 || i==row-1){
                    System.out.print(" * ");
                }
                else{
                    if(j==0 || j==col-1){
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                
            }
            System.out.println();
        }
    }
    public static void right_angle_pattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void number_pattern_left_angle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input");
        int n=sc.nextInt();
        // int sum=sum_of_natural_number(n);
        // System.out.println(sum);
        // table(n);
        // patern(n, 10);
        // hollo(n, n);
        // right_angle_pattern(n);
        number_pattern_left_angle(n);
    }
    
}
