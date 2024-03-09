import java.util.ArrayList;
import java.util.List;

public class EliminarDuplicados {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(10);
        numeros.add(20);
        numeros.add(20);
        numeros.add(30);
        numeros.add(30);
        for (int i = 0; i < numeros.size(); i++) {
        int elemento=numeros.get(i);
            for (int j = i+1; j < numeros.size(); j++) {
                if (numeros.get(j)==elemento){
                    numeros.remove(j);
                }
                
            }
        }

        System.out.println("la lista sin duplicados es "+numeros);
    }
}
