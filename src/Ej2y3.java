public class Ej2y3 {
    //Ej2:
    //a) El máximo de la colección es 24.
    //b) He supuesto que el primer número de la lista era el máximo y lo he comparado con el resto.

    //Ej3:
    public static void main(String[] args) {
        int[] numeros = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};

        //Suponemos que el primer número es el máximo
        int max = numeros[0];

        //Lo comparamos con los demás numeros
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        System.out.println("El máximo de la colección es: " + max);
    }
}
