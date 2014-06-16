/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase10;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Clase10 {

       
    
    public static void main(String[] args) {
        int opcion=0;  
        Scanner teclado= new Scanner(System.in);
        
        do { 
            System.out.println("Digite la opcion del ejercicio a evaluar");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Salir");            
            opcion=teclado.nextInt();
            switch(opcion){
                      case 1:   
                       Ejercicio1 oEjercicio1=new Ejercicio1();
                       oEjercicio1.cargar();
                       oEjercicio1.acumularElementos();
                       oEjercicio1.acumularMayores36();
                       oEjercicio1.cantidadMayores50();
                     }
                     System.out.println(oEjercicio1.ImprimirResultados());
                     break;
                      case 2:
                       Ejercicio2 oEjercicio2=new Ejercicio2();
                       oEjercicio2.cargar();
                       oEjercicio2.sumarVectores(); 
                     
                     System.out.println(oEjercicio2.ImprimirvecSuma());
                     System.out.println(oEjercicio2.ImprimirSumaComponentes());
                      break;
          }while (opcion<6);
      }
  }
       
    
    

