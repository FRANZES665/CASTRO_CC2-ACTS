import java.util.*;

 public class SimpleCalcu{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     String S;
      int q,w, sum;
       System.out.println("Enter # of operations:");
       int num = sc.nextInt();
       
        if(num >= 1 && num <= 100){
         System.out.println("Enter all operation in one line:");
          for( int counter = 1; counter <= num; counter++){
            S = sc.next();
            
           if (S.equals("negate")){
            q = sc.nextInt();
              System.out.println(-q);
            }else if(S.equals("add")){
            q = sc.nextInt();
            w = sc.nextInt();
              System.out.println(sum = q+w);
            }else if(S.equals("max")){
            q = sc.nextInt();
            w = sc.nextInt();
             if (q>w){
             System.out.println(q);
                  }
              else if(w>q){
             System.out.println(w);
                  } 
              else{
             System.out.println(q);   
             }
           }
         }
       }
     }
   }                                                                 