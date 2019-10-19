import java.lang.Math; 
public class CC2_Lab5{
  public static void main(String[]args){
    double messageCount =Math.random () * 1000;
    int typecast = (int) messageCount;
    double charges = 0.5;
    
      if(typecast >200){
          System.out.println("You have sent " + typecast + "messgages.");
          System.out.println("You have incurred " +(typecast*charges) + "php in charges.");
         }else{
            System.out.println("You have incurred no charges");
            }
   }
}
  