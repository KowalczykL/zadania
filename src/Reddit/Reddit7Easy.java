/*
Write a program that can translate Morse code in the format of ...---...
A space and a slash will be placed between words. ..- / --.-
For bonus, add the capability of going from a string to Morse code.
Super-bonus if your program can flash or beep the Morse.
This is your Morse to translate:
.... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--
 */
package Reddit;

import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.X;
import static javafx.scene.input.KeyCode.Z;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class Reddit7Easy {
    
    //wszystkie literki chyba trzeba

    
    
    
    
   public static void tlumaczLitere(String input){
String przerwaLiter = " ";
String przerwaSlow = " / ";
String[] alfabetMorsa = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","..-",".--","-..-","-.--","--..","/"};
String[] alfabetLatin = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "};
String A = ".-";
String N = "-.";
String B = "-...";
String O = "---";
String C = "-.-.";
String P = ".--.";
String D = "-..";
String Q = "--.-";
String E = ".";
String R = ".-.";
String F = "..-.";
String S = "...";
String G = "--.";
String T = "-";
String H = "....";
String U = "..-";
String I = "..";
String V = "...-";
String J = ".---";
String W = ".--";
String K = "-.-";
String X = "-..-";
String L = ".-..";
String Y = "-.--";
String M = "--";
String Z = "--.."; 
   //int pierwszaSpacja;
   //int drugaSpacja;
String input = "test";
char output;

switch (input){
    case ".-":
    output = 'A';
    
    
    
    
}


   } 
}
