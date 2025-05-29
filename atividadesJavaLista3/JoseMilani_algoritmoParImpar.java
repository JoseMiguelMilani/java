import java.util.Scanner;

public class JoseMilani_algoritmoParImpar {

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

    public static String definirParImpar(int numero){
        String parOuImpar = "";

        if (numero % 2 == 0){
            parOuImpar = "par";
        }else{
            parOuImpar = "impar";
        }
        return parOuImpar;
        }

    public static void main(String[] args) {
        
        //definir variavel
        String parouImpar = "";
        int numero ;

        //receber variavel

        imprimir("numero");
        numero = TECLADO.nextInt();

        //processar

        parouImpar = definirParImpar(numero);

        //output

        imprimir(parouImpar);

    }
    
}
