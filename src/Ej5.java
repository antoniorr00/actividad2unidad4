public class Ej5 {
    public static void main(String[] args){
        int[] pagoSemanal={987, 688, 1324, 450, 667, 801};
        int sum=0;

        for (int j=0; j<6; j++){
            sum+=pagoSemanal[j];
        }
    }
}

//Hay un error de sintaxis, el problema estaba en el for porque j<=6 debería de poner j<6.
