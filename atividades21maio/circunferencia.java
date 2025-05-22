
import java.util.Scanner;

public class circunferencia{

    //definindo as funções

    public static void imprimir(String texto) {
        System.out.println(texto);
    }
    
    public final static Scanner TECLADO = new Scanner (System.in);

    public static float lerValorReal() {
        float valor;
        valor = TECLADO.nextFloat();
        return valor; 
    }

    public static double  CalcularCircunferencia (float raio){
        double raioCircunferencia;
        double pi = 3.14; //por que float nao e double sim
        raioCircunferencia = ( (raio * raio) * pi) ;
        return raioCircunferencia;
    }

    //

public static void main(String[] args) {
        
        //declara variavel
        float raio;
        double circunferencia;

        //recebe valor variavel

        imprimir("valor raio");
        raio = TECLADO.nextFloat();

        //processando

        circunferencia = CalcularCircunferencia(raio);

        String circunferenciaformatada = String.format("%.2f", circunferencia);

        //output

        imprimir("area:" + circunferenciaformatada + "cm²");


    }
    
}

