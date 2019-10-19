import java.util.*;

public class Time{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of minutes");
    int minutes = sc.nextInt();
    int hour = minutes/ 60;
    int min = minutes% 60;
      System.out.println( minutes + " minutes is " + hour + " hours and " + min + " minutes");
   }
}