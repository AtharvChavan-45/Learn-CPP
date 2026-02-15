import java.util.Scanner;


public class ContinuePrint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       for(int i=1;i<=10;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
       }

        int num = 1;

        while(num <=10){
           if(num%3==0){
            num++;
            continue;
        
           }
           System.out.println(num);
           num++;

        }
        

        

    }
}