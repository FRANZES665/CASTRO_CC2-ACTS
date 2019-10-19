import java.util.*;
public class UserInput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name="Justin";
		System.out.println("Enter your name");
		name = sc.nextLine();
		System.out.println("Hi " + name );
	}
	
}