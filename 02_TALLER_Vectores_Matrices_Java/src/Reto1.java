import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        int Competidor;
        double TotalTiempo = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero del competidores: ");
        Competidor = lector.nextInt();

        for(int i=1; i<TotalTiempo; i++){
            System.out.println("Ingrese el total a tiempo a calcular" +(i+1)+ "es igual a:");
            double competidor = lector.nextInt();
            TotalTiempo += competidor;
        } double tiempo = TotalTiempo/Competidor;
        System.out.println("El tiempo recorrido del competidor es  :" + TotalTiempo );
         if (tiempo <47){
            System.out.println("El competidpr perdio");
         }else if(tiempo>=47  && tiempo< 40 ){
            System.out.println("El competidor a pasado por poco");
         }else{
            System.out.println("El competidor a pasado");
         }
lector.close();
    }
}
