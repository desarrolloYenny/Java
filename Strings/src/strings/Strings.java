/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author soib1a13
 */
public class Strings {
    
    //CONTAR UN CARACTER
    public static void BuscaLetra(){
      String palabra = "Estoy estudiando java ";
      char letra='a';
      int contador=0;
      
      for(int i=0; i < palabra.length(); i++ ){
          
          if(palabra.charAt(i) == letra){
              contador++;
          }
          
          
      
      }
        System.out.println("hay tantas letras "+ letra+"   "+ contador);
        
    }
    //coje caracter por caracter charAt(i), coje el contenido de la posición cero
     public static void BuscaLetraP(char letra){
      String palabra = "Estoy estudiando java ";
      int contador=0;
      
      for(int i=0; i < palabra.length(); i++ ){
          
          if(palabra.charAt(i) == letra){
              contador++;
          }
      
      }
        System.out.println("hay tantas letras "+ letra+"   "+ contador);
        
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BuscaLetra();
        BuscaLetraP('a');
    }
    
}
