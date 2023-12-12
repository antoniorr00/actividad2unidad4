public class Ej4 {
    public static void main(String[] args) {
        int[] numeros = {-35, -13, -77, -46, -82, -2, -26};

        //Suponemos que el primer número es el mínimo
        int min = numeros[0];

        //Lo comparamos con los demás numeros
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        System.out.println("El máximo de la colección es: " + min);
    }
}
//El mínimo de la lista de enteros es el -82