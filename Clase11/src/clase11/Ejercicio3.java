/*
Imprimir la primera y la ultima fila de la matriz
 */

package clase11;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ejercicio3 {
    private int[][] matriz;
   private Scanner teclado;
   
  public void CargarMatriz()
  {
      teclado=new Scanner(System.in);
      matriz=new int[3][4];
      
      for (int f=0; f<3; f++) {
          for(int c=0; c<4; c++){
          System.out.println("Ingrese el numero correspondiente");
          matriz[f][c]=teclado.nextInt();
      }
    }
  }
  
  public void PrimeraFila()
  {
      System.out.println("Primer fila de la matriz");
      for (int c=0; c<4; c++){
          System.out.println(matriz[0][c]);
      }
  }
  
  public void UltimaFila()
  {
      System.out.println("Ultima fila de la matriz");
      for (int c=0; c<4; c++){
         System.out.println(matriz[2][c]); 
      }
  }
  
  public void PrimerColumna()
  {
      System.out.println("Primer columna de la matriz");
      for (int f=0; f<3; f++){
         System.out.println(matriz[f][0]); 
   }
 }
  
   public void UltimaColumna()
  {
      System.out.println("Ultima columna de la matriz");
      for (int f=0; f<3; f++){
         System.out.println(matriz[f][3]);
   }
  }
}


   