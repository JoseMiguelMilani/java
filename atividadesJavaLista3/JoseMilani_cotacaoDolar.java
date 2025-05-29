
import java.util.Scanner;

public class JoseMilani_cotacaoDolar{

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

    public static double conversaoDolares(double cotacao, double reais){
        double conversao;
        conversao = (reais/cotacao);
        return conversao;

    }


    public static void main(String[] args) {
        
        //difinir as variaveis
        double dolar;
        double cotacao;
        double reais;


        //receber variavel

        imprimir("cotação dolar");
        cotacao = TECLADO.nextDouble();

        imprimir("quantia reais");
        reais = TECLADO.nextDouble();

        //processar

        dolar = conversaoDolares(cotacao, reais);

        //output

        imprimir(conversaoString(dolar));
        

    }


}