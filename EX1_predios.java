import java.util.Scanner;

public class EX1_predios {

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void imprimirNumero(String texto){
            System.out.println(texto);
    }
    
    public final static Scanner TECLADO = new Scanner (System.in);

    public static double lerValorReal() {
        double valor;
        valor = TECLADO.nextDouble();
        return valor; }



    public static void main(String[] args) {
        
        double alturaPredio = 0;
        int numeroAndares = 0;
        double alturaAndares = 0;

        //entrada

        imprimir("altura do predio");
        alturaAndares = TECLADO.nextDouble();



        imprimir("Numero de andares");
        numeroAndares = TECLADO.nextInt();

     

        alturaPredio = (alturaAndares ) * (numeroAndares);

        imprimirNumero(alturaPredio + " metros");

    }
}
