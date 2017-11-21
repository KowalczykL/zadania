/*
write a program that will allow the user to input digits, and arrange them in numerical order.
for extra credit, have it also arrange strings in alphabetical order
 */
package Reddit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class Reddit9Easy {
   
   
       
   
   public static void poukładaj(){
    List<Integer> inputy = new ArrayList<>();   
    Scanner input = new Scanner(System.in);
    Integer cyferka;
    cyferka = input.nextInt();
    
    while(cyferka != null)
    {inputy.add(cyferka);}
    System.out.println(inputy.toString());
    if (cyferka == 0){System.out.println(inputy.toString());}
    
   }
   
}
