import java.util.*;

 public class Grades{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter Grades:");
      int grade = sc.nextInt();
      if (grade > 91 && grade < 101){
          System.out.println("A");
        } else if (grade > 86 && grade < 92){
          System.out.println("B+");
        } else if (grade > 82 && grade < 87){
          System.out.println("B");
        } else if (grade > 78 && grade < 83){
          System.out.println("C+");
        } else if (grade > 74 && grade < 79){
          System.out.println("C");
        } else if (grade > 69 && grade < 75){
          System.out.println("D");
        } else if (grade < 70){
          System.out.println("F");       
        } else {
     System.out.println("Error");
     }
   }
}   
	
	