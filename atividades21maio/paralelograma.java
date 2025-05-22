import  java.util.Scanner;

public class paralelograma{

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


    public static float CalcularAreaParalelograma(float altura, float base){
        float areaPararelolograma;
        areaPararelolograma = altura * base;
        return areaPararelolograma;
    }

public static void main(String[] args) {
        
        //declara variavel

        float altura ;
        float base ;
        float areaPararelolograma; 

        //recebe valor variavel

        imprimir("altura");
        altura = TECLADO.nextFloat();

        imprimir("base");
        base = TECLADO.nextFloat();

        //processando dados

        areaPararelolograma = CalcularAreaParalelograma(altura, base);

        String resultadoFormatado = String.format("%.2f", areaPararelolograma); 

        //output

        imprimir("area:" + resultadoFormatado + "cm²");
    }
}