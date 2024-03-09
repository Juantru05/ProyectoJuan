import java.util.Scanner;

public class DigitosRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int modulo=0;
        int num2=0;

        System.out.println("ingrese un numero");
        int num = scanner.nextInt();
        System.out.println("ingrese el digito que desea consultar");
        int bus = scanner.nextInt();

        while (num>0){
            modulo=num%10;
            num=num/10;
            if (modulo==bus){

                num2=num2+1;

            }
        }
        System.out.println("el numero "+bus+" se repite "+num2+" veces");



    }



}
