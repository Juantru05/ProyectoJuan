import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingrese un numero");
        int num1=scanner.nextInt();

        System.out.println("ingrese un numero");
        int num2=scanner.nextInt();
        scanner.close();
        int mcd=calculadora(num1, num2);
        System.out.println("el mcm de"+num1+", "+num2+"es "+mcd );


    }

    public static int calculadora(int a, int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        return a;
    }
}

