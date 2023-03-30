import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        int Notas;
        double TotaldeNotas = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas que quiere evaluar: ");
        Notas = lector.nextInt();

        for(int i= 1; i<Notas; i++){
            System.out.println("Ingrese la nota a calcular" +i+ ":");
            double Nota = lector.nextInt();
            TotaldeNotas += Nota;
        } double promedioNota = TotaldeNotas/Notas;
        System.out.println("La nota final es de :" + promedioNota);
         if (promedioNota <3){
            System.out.println("Tu perdiste");
         }else if(promedioNota >=3  && promedioNota< 4 ){
            System.out.println("Aprobo la nota raspando");
         }else{
            System.out.println("a pasado con superior");
         }
         lector.close();
    }
}
