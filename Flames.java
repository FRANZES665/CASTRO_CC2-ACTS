package flames;

import java.io.*;

public class Flames {
    
    public static void main(String[] args)throws IOException{
        
        String fName, sName;    
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("===Please enter non caps names===");
           System.out.println("Enter your name: ");
           fName = buff.readLine();
           
           System.out.println("Enter your crush name: ");
           sName = buff.readLine();
           
           process(fName,sName);
           
    } 
    
    public static void process(String you, String crush)
    {
        
        String[][] flames = {
                    {"F","Friends"},
                    {"L","Lovers"},
                    {"A","Acquaintance"},
                    {"M","Married"},
                    {"E","Enemies"},
                    {"S","Sweethearts"}
                            };

        String[] yArr = new String[you.length()];
        String[] cArr = new String[crush.length()];
        
        for (int i = 0; i < yArr.length; i++) {
            yArr[i] = you.substring(i, i+1);
        }
        for (int i = 0; i < cArr.length; i++) {
            cArr[i] = crush.substring(i, i+1);
        }
         int base=0;
        String ch;
        for (int i = 0; i < yArr.length; i++) {
            
            for (int j = 0; j < cArr.length; j++) {
                if (yArr[i].equals(cArr[j])) {
                    base++;
                    break;
                }
         }
        }
       int moew = base*2;
       int fLength = (cArr.length+yArr.length);
       int ha = fLength-moew;
       System.out.println(moew);
       System.out.println(ha);
        System.out.println();
        for (int i = 0; i < flames.length; i++) {
            System.out.println(flames[i][i]);
            
        }
    }
}