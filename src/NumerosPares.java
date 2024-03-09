public class NumerosPares {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int produc=1;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                produc*=array[i];
            }

        }

        System.out.println("el producto de los numeros pares de un vector que va del 1 al 10 es "+produc);

    }
}
