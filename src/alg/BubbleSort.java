/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class BubbleSort {
    int[] wejsciowy;
    int[] wyjsciowy;
    
    public int[]sort (int[] input){


        int pierwszy;
        int drugi; 
       int dlugosc = input.length;
       System.out.print("Elementy listy: ");
       for (int i = 0; i < input.length; i++){
       System.out.print(input[i]+";");}
       System.out.println("dlugosc listy - "+dlugosc);
        System.out.println("dlugosc listy - "+dlugosc);
        
        for (int j = 0; j < input.length-1; j++){
            //if(input[j]>input[j+1])
            {
        
        for (int i = 0; i < dlugosc-1; i++){
            pierwszy = input[i];
            drugi = input[i+1];
            if(pierwszy > drugi){
                input[i] = drugi;
                input[i+1] = pierwszy;
                //j=0;
            }
            
            }
        
         }
            
        }
       System.out.print("Elementy listy: "); 
       for (int i = 0; i < input.length; i++){
        System.out.print(input[i]+";");}        
return input;
    }
    
    
    
}
