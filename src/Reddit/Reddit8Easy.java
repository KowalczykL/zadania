/*
write a program that will print the song "99 bottles of beer on the wall".
for extra credit, do not allow the program to print each loop on a new line.
 */
package Reddit;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class Reddit8Easy {
    
    
    
    public static void spiewaj(){
        int ile = 99;
        String zwrotka = " butelek piwa na ścianie, gdy jedną zabuerzesz ile zostanie";
        for (int i = 99; i>=0; i--){
            if(i>4){System.out.println(i+zwrotka);}
            else if (i>1){System.out.println(i+" butelki piwa na ścianie, gdy jedną zabuerzesz ile zostanie");}            
            else if (i==1){System.out.println(i+" butelka piwa na ścianie, gdy jedną zabuerzesz ile zostanie");}
            else {System.out.println("Zero butelek i buuuum");}
        }
        
    }
}
