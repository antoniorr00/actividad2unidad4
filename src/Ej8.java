public class Ej8 {
    public static void main(String[]args){
        double[] array= {-47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42};
        double media=0.0;
        for ( double valor: array){
            media+=valor;
        }
        media/=7;
        System.out.println("La media es: "+media);
    }
}
