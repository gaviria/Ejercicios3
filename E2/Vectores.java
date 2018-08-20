/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author fgavi
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int elemnetos_a;
        int elemnetos_b;
    
        Set<Integer> vector_a = new HashSet<>(Arrays.asList());
        Set<Integer> vector_b = new HashSet<>(Arrays.asList());
        Set<Integer> vector_c = new HashSet<>();
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Elementos no comunes entre 2 vectores");
        System.out.println("-------------------------------------");
        
        //Pedir el primer numero de elementos del vector
        do{
            System.out.println("Digita el 'número' de elemnetos del vector A");
            elemnetos_a = entrada.nextInt (); //Invocamos un método sobre un objeto Scanner
        }while(elemnetos_a <= 0);
        
        for (int i=0;i<elemnetos_a;i++){
            
                System.out.println("Digita los datos del vector A["+i+"]");               
                vector_a.add(entrada.nextInt());
            
        }
        
        //Pedir el primer numero de elementos del vector
        do{
            System.out.println("Digita el 'número' de elemnetos del vector B");
            System.out.println("-------------------------------------");
            elemnetos_b = entrada.nextInt(); //Invocamos un método sobre un objeto Scanner
        }while(elemnetos_b <= 0);
        
        for (int i=0;i<elemnetos_b;i++){
          
                System.out.println("Digita los datos del vector B["+i+"]");
                vector_b.add(entrada.nextInt());
            
        }
        
        
        for (Integer el: vector_a) {
          if (!vector_b.contains(el)) {
            vector_c.add(el);
          }
        }
        for (Integer el: vector_b) {
          if (!vector_a.contains(el)) {
            vector_c.add(el);
          }
        }
        System.out.println("Los elementos no comunes del vector a y b son : "
            + vector_c);
    }
}
