import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double CF=0;
        System.out.println("Ingrese la cantidad inicial de su inversion");
        double ci=scan.nextDouble();
        System.out.println("Ingrese la tasa de interes de su inversion (en porcentaje)");
        double TI=scan.nextDouble();
        System.out.println("Ingresa la contribucion de interes anual");
        int FI=scan.nextInt();
        System.out.println("Ingrese la cantidad de años que tendra su inversion");
        double NA=scan.nextDouble();

        double ti=TI/100;
        CF=ci*Math.pow(1+ti/FI, FI*NA);
        System.out.println("la cantidad dinero que recibira es de "+CF);
        System.out.println("Su ganancia sera de "+(CF-ci));



    }
}
