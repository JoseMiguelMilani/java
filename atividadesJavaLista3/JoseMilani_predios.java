
import java.util.Scanner;

public class JoseMilani_predios{
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static String conversaoString(double numero){
        String convertido;
        convertido = String.format("%.2f", numero);
        return convertido;
    }

    public final static Scanner TECLADO = new Scanner (System.in);

    public static float lerValorReal() {
        float valor;
        valor = TECLADO.nextFloat();
        return valor; 
    }

    public static double calculoTamanho(double alturaAndar, int quantAndar ){
        double tamanhopredio;
        tamanhopredio = alturaAndar*quantAndar;
        return tamanhopredio;

    }

    public static void main(String[] args) {

        //difinir as variaveis
        double alturaAndar;
        int quantAndar;
        double tamanhopredio;


        //receber variavel

        imprimir("tamanho andar");
        alturaAndar = TECLADO.nextDouble();

        imprimir("quantia de andar");
        quantAndar = TECLADO.nextInt();

        //processar

        tamanhopredio = calculoTamanho(alturaAndar, quantAndar);

        //output

        imprimir(conversaoString(tamanhopredio));
        
}
}