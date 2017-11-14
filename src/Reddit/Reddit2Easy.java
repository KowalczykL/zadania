/*
Hello, coders! An important part of programming is being able to apply your programs, so your challenge for today is to create a calculator application that has use in your life. It might be an interest calculator, or it might be something that you can use in the classroom. For example, if you were in physics class, you might want to make a F = M * A calc.
EXTRA CREDIT: make the calculator have multiple functions! Not only should it be able to calculate F = M * A, but also A = F/M, and M = F/A!
 */
package Reddit;

import java.util.Scanner;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class Reddit2Easy {
    
    public static void licz(){
       String liczba1;
       double liczba1int;
       String liczba2;
       double liczba2int;
       String operacja;
       String mnozenie = "*";
       String dzielenie = "/";
       String dodawanie = "+";
       String odejmowanie = "-";
       double wynik = 0;
       System.out.println("Podaj pierwsza liczbe");
       Scanner input = new Scanner(System.in);
       liczba1 = input.nextLine();
       //liczba1.replace(",",".");
       liczba1int = Double.parseDouble(liczba1.replace(",","."));
       System.out.println("Podaj druga liczbe");
       liczba2 = input.nextLine();
       //liczba2.replace(",",".");
       liczba2int = Double.parseDouble(liczba2.replace(",","."));
       System.out.println("Podaj działanie");
       operacja = input.nextLine();
       if(operacja.equals(dodawanie)){
           wynik = liczba1int+liczba2int;
       }
       else if(operacja.equals(odejmowanie)){
           wynik = liczba1int-liczba2int;
       }
       else if(operacja.equals(mnozenie)){
           wynik = liczba1int*liczba2int;
       }
       else if(operacja.equals(dzielenie)){
           wynik = liczba1int/liczba2int;
       }
       
       //wynik = liczba1int+operacja+liczba2int;
       
      System.out.println(wynik);  
    }
    
}
