public class CC2_Lab4{
  public static void main(String[]args){
    String name = ""; 
    int Age = 16;
      if (name =="Jhim"|| name =="Ethan"){
      if (Age > 4 && Age < 11){
        System.out.println("Hamster,Dog");
       }else if (Age > 10 && Age < 16){
        System.out.println("Spider,Dog");
       }else if (Age > 15 && Age < 21){
        System.out.println("Dog,Snake");
       }else if (Age == 21){
        System.out.println("No pets,Not interested");
       }
       } else if (name =="Sally"|| name =="Joy"){
       if (Age > 4 && Age < 11){
        System.out.println("Hamster,cat");
       }else if (Age > 10 && Age < 16){
        System.out.println("Cat,Rabbit");
       }else if (Age > 15 && Age < 21){
        System.out.println("Cat");
       }else if (Age > 21){
        System.out.println("No pets,Not interested");
       }
     } else {
     System.out.println("Error");
     }
     
   }
 }
  