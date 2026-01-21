import java.util.Scanner;

public  class opposite {
    
        void pattern(int n){
            for(int i = n;i >= 0;i--){
                for(int j = 1; j <= i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    public static void main(String[] args){
        opposite op = new opposite();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        op.pattern(n);

        sc.close();
    }
}