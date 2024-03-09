import java.util.Scanner;

public class OrdenNumerico {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese 1 numero");
        int num1=scanner.nextInt();
        System.out.println("Ingrese 1 numero");
        int num2=scanner.nextInt();
        System.out.println("Ingrese 1 numero");
        int num3=scanner.nextInt();
        scanner.close();

        if (num1<num2 && num2<num3){
            System.out.println("el orden de los numeros es "+num1+","+num2+","+num3);

        }else if (num1<num3 && num2>num3){
            System.out.println("el orden de los numeros es "+num1+","+num3+","+num2);

        } else if (num1>num2 && num1<num3) {
            System.out.println("el orden de los numeros es "+num2+","+num1+","+num3);

        }else if (num2<num3 && num3<num1){
            System.out.println("el orden de los numeros es "+num2+","+num3+","+num1);
        } else if (num1>num2 && num2>num3) {
            System.out.println("el orden de los numeros es "+num3+","+num2+","+num1);
        }else if (num1>num3 && num2>num3) {
            System.out.println("el orden de los numeros es "+num3+","+num1+","+num2);
        }else {
            System.out.println("ups, hay 2 numeros iguales");
        }

    }
}
