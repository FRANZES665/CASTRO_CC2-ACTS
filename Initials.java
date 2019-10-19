import javax.swing.*;
public class Initials{ 
  public static void main(String[] args){ 
    String first = "Justin";
    String middle = "Arsua";
    String last = "Castro"; 
      first = JOptionPane.showInputDialog ("Enter your first name's initials:"); 
        char q = first.charAt(0);
      middle = JOptionPane.showInputDialog ("Enter your middle name's initials:"); 
        char w = middle.charAt(0);
    last = JOptionPane.showInputDialog ("Enter your last name's initials:");
        char e = last.charAt(0);
    JOptionPane.showMessageDialog(null, q + "" + w + "" + e);  
   }
}   
      
