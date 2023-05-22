import java.lang.reflect.Array;
import java.util.Scanner;

// Your First Program

class HelloWorld {
    public static int[] revrse(int[] A){
        int index=0;
        int start=0;
        int end=A.length-1;
        while(start<end){
            int temp=A[start];
            A[start]=A[end];
            A[end]=temp;
            start+=1;
            end-=1;


        }
        return A;

        
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        int[] array=new int[100];
        int size=array.length;
        int x;
        System.out.println(size);
        for(int i=0;i<size;i++){
            array[i]=i+1;
        }
        array=revrse(array);
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(x);
    }
}