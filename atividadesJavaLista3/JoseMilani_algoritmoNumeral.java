import java.util.Scanner;

public class JoseMilani_algoritmoNumeral {
    
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

    public static String definirTipoNumeral(int numero){
        String tipoNumeral = "";
        if (numero > 0){
            tipoNumeral = "positivo";
        }else if (numero < 0){
            tipoNumeral = "negatiovo";
        }else{
            tipoNumeral = "é zero";
        }
        return tipoNumeral;
    }

    public static void main(String[] args) {
        
        //definir variavel
        String tipoNumeral = "";
        int numero ;

        //receber variavel

        imprimir("numero");
        numero = TECLADO.nextInt();

        //processar

        tipoNumeral = definirTipoNumeral(numero);

        //output

        imprimir(tipoNumeral);

    }
}
