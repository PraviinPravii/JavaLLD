public class loops {

    public static void main(String[] args) {
        int times=10;
        for(int count=0;count<times;count++){
            System.out.print("for Hello World!");
        }
        int count=0;
        while(count<times){
            System.out.print("While Hello World!");
            count++;
        }
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<11);
    }
    
}
