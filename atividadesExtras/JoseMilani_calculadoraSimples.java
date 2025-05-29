import java.util.Scanner;

public class JoseMilani_professores {
    
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

    public static double calcular(char tipoConta, double valor1, double valor2){
        double resultado;

        switch (tipoConta) {
            case '*':
                resultado = valor1 * valor2;
                break;

            case '+':
                resultado = valor1 + valor2;
                break;
            
            case '-':
                resultado = valor1 - valor2;
                break;
            case '/':
                resultado = valor1 / valor2;
                break;     
        
            default:
                resultado = 0;
                break;
        }
        return resultado;
        
        
    }

    public static void main(String[] args) {
        
        //definir variavel
        char character ;
        double valor1 ;
        double valor2 ;
        double resultado;

        //receber variavel

        imprimir("valor1");
        valor1 = TECLADO.nextDouble();

        imprimir("valor2");
        valor2 = TECLADO.nextDouble();

        imprimir("operação");
        character = TECLADO.next().charAt(0);


        //processar

        resultado = calcular(character, valor1, valor2);

        //output

        imprimir(valor1 + " " + character + " " + valor2 + " = " + resultado);

    }
}
