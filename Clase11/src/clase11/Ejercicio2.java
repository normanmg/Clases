/*
 Crear y cargar una matriz de 4 filas por 4 columnas. Imprimir la diagonal principal.
              x    -    -    -
              -    x    -    -
              -    -    x    -
              -    -    -    x

 */

package clase11;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ejercicio2 {
    private int[][] matriz;
   private Scanner teclado;
   
  public void CargarMatriz()
  {
      teclado=new Scanner(System.in);
      matriz=new int[4][4];
      
      for (int f=0; f<4; f++) {
          for(int c=0; c<4; c++){
          System.out.println("Ingrese el numero correspondiente");
          matriz[f][c]=teclado.nextInt();
      }
    }
  }
  
  public void ImprimirDiagonal()
  {
      for (int i=0; i<4; i++){
          for (int j=0; j<4; j++){
              
              if(i==j)
              {
               System.out.print(matriz[i][i]+" ");   
              }
              else
              {
                 System.out.print("_"+" ");  
              }
          }
          System.out.println();
      }
          
  }
}

      
