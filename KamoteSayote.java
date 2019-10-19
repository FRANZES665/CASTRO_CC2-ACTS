import java.util.*;
public class KamoteSayote{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n, m, k, x, y;
      System.out.println("Enter input:");
      n = sc.nextInt();
      m = sc.nextInt();
      k = sc.nextInt();
      x = n/m;
      y = (n%m)*k;
        if (n >= 1&&m >= 1&&n  <= 1000&&m <= 1000&&k <= 1000 && m <= n){
        System.out.println(x + " Kamotes ");
         System.out.println(y + " Sayotes ");
         } else {
          System.out.println("Invalid Input");
      }
    }  
}    