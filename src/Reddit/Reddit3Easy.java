/*
Welcome to cipher day!
write a program that can encrypt texts with an alphabetical caesar cipher. This cipher can ignore numbers, symbols, and whitespace.
for extra credit, add a "decrypt" function to your program!
 */
package Reddit;

import java.util.Scanner;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class Reddit3Easy {
    
    public static void decrypt(){
            String in;
        int alg;
        Scanner input = new Scanner(System.in);
        in = input.nextLine();
        alg = input.nextInt();
        StringBuffer out = new StringBuffer(in.length());
        char tabIn[] = in.toCharArray();
        for(char litera:tabIn)
        {
           litera -= alg; 
            out.append(litera);
        }
        System.out.println(out);
        
    
    }    
    
    
    
    public static void encrypt(){
        String in;
        int alg;
        Scanner input = new Scanner(System.in);
        in = input.nextLine();
        alg = input.nextInt();
        StringBuffer out = new StringBuffer(in.length());
        char tabIn[] = in.toCharArray();
        for(char litera:tabIn)
        {
           litera += alg; 
            out.append(litera);
        }
        System.out.println(out);
        
        
    }
    
}
