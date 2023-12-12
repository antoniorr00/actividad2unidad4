public class Ej9 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        if (Equals(array1, array2)) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays son distintos.");
        }
    }

    //Comparar dos arrays
    public static boolean Equals(int[] array1, int[] array2) {
        //Comprobar si ambos arrays son nulos
        if (array1 == null && array2 == null) {
            return true;
        }

        //Comprobar si uno de los arrays es nulo y el otro no lo es
        if ((array1 == null && array2 != null) || (array1 != null && array2 == null)) {
            return false;
        }

        //Comprobar si ambos arrays tienen la misma longitud
        if (array1.length != array2.length) {
            return false;
        }
        //Comprobar elemento por elemento
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        //Aquí los arrays son iguales
        return true;
    }
}

