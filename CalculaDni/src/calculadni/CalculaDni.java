/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadni;

import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author soib1a13
 */
public class CalculaDni {

    public static void calculaDni() {

        String Letra[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "d", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        System.out.print("Introduce el número de Dni ");
        Scanner valorDni = new Scanner(System.in);

        int dni = valorDni.nextInt() % 23;
        System.out.println("Tu número de letra de Dni es: " + Letra[dni]);

    }

    public static void calculaNif() {

        String Letra[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "d", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        String LetraNif[] = {"X", "Y", "Z"};
        System.out.print("Introduce el número de Nif ");
        Scanner valorDni = new Scanner(System.in);
        String nif = valorDni.next();
        String numeronif = "";
        int numeroTotal = 0;
        for (int i = 1; i < nif.length(); i++) {

            numeronif = numeronif + nif.charAt(i);

        }
      
        //System.out.print(numeronif);
    
        char letraExNif = nif.toUpperCase().charAt(0);
        for (int i = 0; i < LetraNif.length; i++) {
            if ( LetraNif[i].charAt(0) == letraExNif) {
                numeronif = i +numeronif;

            }
                 
        }
         


        numeroTotal = Integer.parseInt(numeronif)%23;  //convierto a entero
        //System.out.print(numeronif);
        System.out.println("\n La letra de tu Nif es: " + Letra[numeroTotal]);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //calculaDni();
        calculaNif();
    }

}
