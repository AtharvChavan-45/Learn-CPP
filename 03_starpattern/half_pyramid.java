import java.util.Scanner;

public class half_pyramid {
    
    void pattern(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        half_pyramid hf = new half_pyramid();
        Scanner sc = new Scanner(System.in);

        System.out.print("Input any number : ");
        int n = sc.nextInt();
        hf.pattern(n);

        sc.close();
    }

}