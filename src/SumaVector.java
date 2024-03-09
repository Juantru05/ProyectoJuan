import java.lang.reflect.Array;
import java.util.ArrayList;

public class SumaVector {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int suma=0;

        for (int i = 0; i < array.length; i++) {
            suma+=array[i];
        }
        System.out.println("la suma de los digitos del vector, cuyos numeros son 1,2,3,4,5 es "+suma);
    }
}
