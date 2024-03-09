public class NumeroMayor {
    public static void main(String[] args) {
        int [] array= {10, 20, 30, 40, 50};
        int numeromax=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>numeromax){
                numeromax=array[i];
            }

        }
        System.out.println("el numero maximo es "+numeromax);
    }
}
