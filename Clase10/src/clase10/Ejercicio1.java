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
public class Ejercicio1 {
    private Scanner teclado;
    private int[] vec;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        vec=new int[8];
        for(int i=0;i<8;i++) {
            System.out.print("Ingrese elemento:");
            vec[i]=teclado.nextInt();
        }
    }
    
    public void acumularElementos() {
        int suma=0;
        for(int i=0;i<8;i++) {
            suma=suma+vec[i];
        }
        System.out.println("La suma de los 8 elementos es:"+suma);
    }
    
    public void acumularMayores36() {
        int suma=0;
        for(int i=0;i<8;i++) {
            if (vec[i]>36) {
                suma=suma+vec[i];
            }
        }
        System.out.println("La suma de los elementos mayores a 36 es:"+suma);
    }
    
    public void cantidadMayores50() {
        int cant=0;
        for(int i=0;i<8;i++) {
            if (vec[i]>50) {
                cant++;
            }    
        }
        System.out.println("La cantidad de valores mayores a 50 es:"+cant);
    }
    
}
  