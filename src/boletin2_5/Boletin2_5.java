
package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {

    
    public static void main(String[] args) {
        
        float numMillas, metros;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir las millas");
        numMillas = sc.nextFloat();
        metros=numMillas*1609;
        System.out.println(numMillas+" millas son "+metros+ " metros ");
    }
    
}
