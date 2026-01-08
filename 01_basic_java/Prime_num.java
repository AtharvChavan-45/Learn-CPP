import java.util.*;
import java.util.Scanner;

public class Main{
  
  static void primeNumber(int n){
    int count=0;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        count++;
      }
    }
    if(count==2){
      System.out.print("Number is prime");
    }else{
      System.out.print("Number is not prime");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter any numeber:\n");
    int num = sc.nextInt();
    
    primeNumber(num);
  }
}