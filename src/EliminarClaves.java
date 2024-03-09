import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EliminarClaves {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1,"hola");
        mapa.put(2,"hola");
        mapa.put(3,"hola");
        mapa.put(4,"hola");
        mapa.put(5,"hola");
        mapa.put(6,"hola");
        mapa.put(7,"hola");
        mapa.put(8,"hola");
        mapa.put(9,"hola");
        mapa.put(10,"hola");

        System.out.println("el valor inicial del hashmap es "+mapa);

        System.out.println("ingrese un numero para eliminar los elementos menores a este");
        int num= scanner.nextInt();
    eliminar(mapa, num);
        System.out.println("el nuevo hashmap despues de eliminar es "+mapa);

    }


public static void eliminar (Map<Integer, String> map, int num){
    Iterator<Map.Entry<Integer, String>> iterador= map.entrySet().iterator();

    while (iterador.hasNext()){
        Map.Entry<Integer, String> entry=iterador.next();
        if (entry.getKey()<num){
            iterador.remove();
        }
    }

}
}
