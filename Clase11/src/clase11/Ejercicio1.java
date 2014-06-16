/*
1- Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, 
cargar sus componentes y luego imprimirlas.
               "[f][c]"
 */

package clase11;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ejercicio1 {
   private int[][] matriz;
   private Scanner teclado;
   
  public void CargarMatriz()
  {
      teclado=new Scanner(System.in);
      matriz=new int[3][5];
      
      for (int f=0; f<3; f++) {
          for(int c=0; c<5; c++){
          System.out.println("Ingrese el numero correspondiente");
          matriz[f][c]=teclado.nextInt();
      }
    }
  }
  public void Imprimir()
  {
      for (int f=0; f<3; f++){
          
          for (int c=0; c<5; c++){
              
             System.out.println(matriz[f][c] +" "); 
          }
          System.out.println();
      }
  }
}



