import java.util.*; 
  public class Numbers{ 
    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
        System.out.print("Input 6 numbers from 0-9: ");
        try{
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();

      int num = 11;
        while(num<99){
          int tens = num/10;  
          int ones = num % 10;
          boolean ten = tens == num1 || tens == num2 ||  tens == num3 ||  tens == num4 ||  tens == num5 ||  tens == num6; 
          boolean one = ones == num1 || ones == num2 ||  ones == num3 ||  ones == num4 ||  ones == num5 ||  ones == num6;
            if (ten == true || one == true){
                          num ++;
                          continue; 
                        
              }else{
                          System.out.println(num);  
                           num++;     
                                                  }
                                                  }}
            catch(InputMismatchException num1){
            System.out.print("Please enter a valid number");
        }
}
}