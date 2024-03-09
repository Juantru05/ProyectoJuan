import java.util.Scanner;

public class ConversionMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la moneda a la cual deseas convertir");
        String mon = scanner.nextLine();
        System.out.println("ingresa la TRM");
        float TRM = scanner.nextFloat();
        System.out.println("ingresa la cantidad que sea convertir");
        float can = scanner.nextFloat();
        System.out.println("la cantidad que ingresaste es igual a " + TRM * can + " " + mon);
    }
}
