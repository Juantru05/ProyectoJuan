

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Map<String, double[]> mapa = new HashMap<>();
        double [] Samuel = {3.5, 5.0, 1.0};
        double [] Esteban = {4.5, 1.0, 2.5};
        double [] Santiago = {2.5, 5.0, 3.0};

        mapa.put("Samuel", Samuel);
        mapa.put("Esteban", Esteban);
        mapa.put("Santiago", Santiago);

        System.out.println("ingresar el nombre del estudiante 1. samuel, 2. esteban, 3. santiago");
        int nume=scanner.nextInt();

        switch (nume){
            case 1:
                System.out.println("El promedio de Samuel es "+promedio(Samuel));
                break;
            case 2:
                System.out.println("El promedio de Esteban es "+promedio(Esteban));
                break;
            case 3:
                System.out.println("El promedio de Santiago es "+promedio(Santiago));
                break;


        }

    }

    public static double promedio(double array[]){
        double suma=0;
        double prom=0;

        for (int i = 0; i < array.length; i++) {
            suma+=array[i];
            prom=suma/3;

        }
        return prom;

    }

}
