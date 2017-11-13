/*
create a program that will ask the users name, age, and reddit username. have it tell them the information back, in the format:

your name is (blank), you are (blank) years old, and your username is (blank)

for extra credit, have the program log this information in a file to be accessed later.

 */
package Reddit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author puszatek
 */
public class Reddit1Easy {
    
    public static void zadanie1(){
    String name;
    String age;
    String username;
    System.out.println("Jak masz na imię?");
    Scanner input = new Scanner(System.in);
    name = input.nextLine();
    
    System.out.println("Ile masz latek?");
    age = input.nextLine();
    
    System.out.println("Jaki masz username?");
    username = input.nextLine();
    
    
    System.out.println("Masz na imię: "+name);
    System.out.println("Masz "+age+" latek");
    System.out.println("Twój username to: "+username); 
    System.out.println("Your name is "+name+", you are "+age+" years old, and your username is ("+username);
    
    //File fout = new File("Reddit1");
        try {
            FileOutputStream output = new FileOutputStream("Reddit1E");
            PrintStream data=new PrintStream(output);
            data.println("Masz na imię: "+name);
            data.println("Masz "+age+" latek");
            data.println("Twój username to: "+username);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reddit1Easy.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
}
    
    
    
    
    
}
