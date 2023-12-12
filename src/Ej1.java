import java.util.Scanner;

public class Ej1 {
    public static void main(String[]args){
        int[] array;
        Scanner scanner=new Scanner(System.in);

        System.out.println("¿Cuál es el tamaño del array? ");
        int size= scanner.nextInt();

        array=new int[size];

        for (int i=0; i< array.length; i++){
            System.out.println("Inserta un entero: ");
            array[i]= scanner.nextInt();
        }
    }
}
// Faltaba por poner size en la línea de código "array=new int[size];" para crear un nuevo array de enteros con el tamaño especificado por el usuario.