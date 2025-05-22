import java.util.Scanner;

public class AreaTriangulo {

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

    public static float CalcularAreaTriangulo(float altura, float base){
        float areaDoTriangulo;
        areaDoTriangulo = (altura*base) / 2;
        return areaDoTriangulo;
    }

    //


public static void main(String[] args) {
        
        //declara variavel
        float altura ;
        float base ;
        float areaTriangulo; 

        //recebe valor variavel

        imprimir("altura");
        altura = TECLADO.nextFloat();

        imprimir("base");
        base = TECLADO.nextFloat();

        //processando dados

        areaTriangulo = CalcularAreaTriangulo(altura, base);

        String resultadoFormatado = String.format("%.2f", areaTriangulo); //2 numeros depois da virgula

        //output

        imprimir("area:" + resultadoFormatado + "cm²");
    }

    
}
