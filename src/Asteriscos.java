import java.util.Scanner;

public class Asteriscos {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("ingresa un numero para crear una piramide");
        int num=scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
