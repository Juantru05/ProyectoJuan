import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("escoger 1.piedra 2.tijera 3.papel");
        int usu = scan.nextInt();
        int pc = random.nextInt(3) + 1;
        if (pc == 1 && usu == 1 || pc == 2 && usu == 2 || pc == 3 && usu == 3) {
            System.out.println("el pc eligio " + pc + " es un empate");
        } else if (pc == 1 && usu == 2 || pc == 2 && usu == 3 || pc == 3 && usu == 1) {
            System.out.println("el pc eligio " + pc + " Gana pc");
        } else if (pc == 1 && usu == 3 || pc == 2 && usu == 1 || pc == 3 && usu == 2) {
            System.out.println("el pc eligio " + pc + " ganaste");
        }

    }
}

