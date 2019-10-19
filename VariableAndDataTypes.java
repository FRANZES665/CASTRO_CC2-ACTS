public class VariableAndDataTypes{
  public static void main(String[]args){
    char A = 'A';
    float F = 16.0f;
    double degrees = 23.5;
    byte hours = 24;
    short days = 7;
    int weeks = 4;
    long months = 12;
    boolean q = false;
      if (q == true){ 
      System.out.println("The temperature in Baguio City has warmed throughout the years.");
      System.out.println("\t "+A+" recent news article stated that the City has been averaging "  +F+ " degrees celsius at dawn and " +degrees+" at noon.");
      System.out.print("\t Regardless, lowlanders still feel cold " +hours+ " hours a day " +days+ " days a week " +weeks+ " weeks per month " +months+ " months each year.");
     } 
      else {
     System.out.println("The boolean was changed to a false value");
    }
  }
 }