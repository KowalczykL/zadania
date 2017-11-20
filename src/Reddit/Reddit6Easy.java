/*
You're challenge for today is to create a program that can calculate pi accurately to at least 30 decimal places.
Try not to cheat :)
 */
package Reddit;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class Reddit6Easy {  //ciekawe, do pomyslenia
    
    public static void liczPi(){  //http://jknow.republika.pl/pi/pi.html
        
      double pi = Math.PI;
        double piB = Math.PI;
        BigDecimal piBD = (BigDecimal.valueOf(Math.PI));
      
        
       System.out.println(pi);
       System.out.println(piB);
       System.out.println(piBD);
    }
    
    
}
