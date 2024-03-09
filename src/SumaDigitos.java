import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num=scanner.nextInt();
        int suma=0;
      while (num!=0){
          suma+=num%10;
          num=num/10;
        }
      int resu=suma;
        System.out.println("El resultado de la suma de los digitos del numero ingresado es "+suma);
    }
}
