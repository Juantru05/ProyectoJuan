import java.util.Random;
import java.util.Scanner;

public class SumaAleatoria {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        int NumPc1= random.nextInt(10)+1;
        int NumPc2= random.nextInt(10)+1;
        System.out.println("Porfavor ingresa la suma de los 2 numeros siguientes "+NumPc1+","+NumPc2);
        int NumTec= scanner.nextInt();
        scanner.close();
        if (NumPc1+NumPc2==NumTec){
            System.out.println("Felicidades, sumaste correctamente");
        }else {
            System.out.println("ups, tuviste un error de calculo");
        }
    }
}
