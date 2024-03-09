import java.util.Scanner;

public class AnoBisiesto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese el año");
        int ano = scan.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.println("el año es bisiesto");
        } else if (ano % 100 == 0 && ano % 400 != 0) {
            System.out.println("el año no es bisiesto");
        } else if (ano % 100 == 0 && ano % 400 == 0) {
            System.out.println("el año es bisiesto");
        } else {
            System.out.println("el año no es bisiesto");
        }
        scan.close();
    }

}