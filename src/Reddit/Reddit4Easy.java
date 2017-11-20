/*
You're challenge for today is to create a random password generator!
For extra credit, allow the user to specify the amount of passwords to generate.
For even more extra credit, allow the user to specify the length of the strings he wants to generate!
 */
package Reddit;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class Reddit4Easy {
    
    
    public static String[] generujHasla(int ilosc, int dlugosc){
       String[] hasla = new String[ilosc]; 
       for (int i = 0; i<ilosc; i++) {
           hasla[i] = generujHaslo(dlugosc);
       }
       return hasla;
    }
    
    
    
    public static String generujHaslo(int dlugosc){
        StringBuffer haslo = new StringBuffer(dlugosc);
        for(int h =0; h<dlugosc; h++)
        {
            haslo.append(generujZnak());
            
            
        }
        System.out.println(haslo);
        return haslo.toString();
         
    }
    
    
    
    public static char generujZnak(){
     double rand = Math.random();
     //char lit = (char) 12;
     double mnoznik = 90;
     int startowa = 35;
     int wynik = (int)(startowa+(rand*mnoznik));
     //System.out.println(wynik);
     return (char)wynik;
//     for(int i =0; i<200; i++)
//     
//     
//     {System.out.println(i+"--"+(char)i);
//     System.out.println(rand);
//     }
     
    }   
    }
