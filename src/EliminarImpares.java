import java.util.ArrayList;

public class EliminarImpares {
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        for (int i = 0; i < lista.size(); i++) {
           if (lista.get(i) %2!=0){
               lista.remove(i);
           }


        }
        System.out.println("los numeros pares de una lista con numeros del 1 al 10 son "+lista);

    }
}
