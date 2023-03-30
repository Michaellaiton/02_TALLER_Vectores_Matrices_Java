import java.util.Scanner;

public class Reto4{
     public static void main(String[] args) {
        Scanner sudocu= new Scanner(System.in);
        int sodocu, n, c, i, a, e, fila, columna;
        System.out.println("Dijite el tamaño de la fila, la misma sera igual a las columnas");
        sodocu =sudocu.nextInt();

        int [][] numero = new int[sodocu][sodocu];
                 
        {for (c = 0; c <sodocu; c ++){
                            System.out.println("Ingrese el numero de filas "+ (c+1)+ "Ingrese el numero que va iran en cada colunma "+ (c+1));
        }
    }
                      for (n = 0; n <sodocu; n ++){
        for (c = 0; c <sodocu; c ++){
                   System.out.print(numero[n][c]+ "\t");    
        }
        
           System.out.println();
    }
        for (i = 0; i <sodocu; i ++){
         fila=0;
             for (a = 0; a <sodocu; a ++){
                  fila += numero[i][a];   
        }
        System.out.print("La suma de fila " + (i+1) + " es" + fila); 
    }
        for (c = 0; c <sodocu; c ++){
        columna=0;
        for (e = 0;e <sodocu; e ++)       
                   System.out.print("La suma de columna" + (c+1) + " es" + columna); 
        }
        sudocu.close();
}
}