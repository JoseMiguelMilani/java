import java.util.Scanner;

public class trianguloEquilatero{

 //definindo as funções

    public static void imprimir(String texto) {
        System.out.println(texto);
    }
    
    public static double raizquadrada(float numero){
        return Math.sqrt(numero);
    }

    public static double potencia(float  numero, int elevado) {
        return Math.pow(numero, elevado);
    }

    public final static Scanner TECLADO = new Scanner (System.in);

    public static float lerValorReal() {
        float valor;
        valor = TECLADO.nextFloat();
        return valor; 
    }

        public static float CalcularAreaTrianguloEquilatero(float ladoTriangulo){
        float areaDoTrianguloEquilatero;
        areaDoTrianguloEquilatero = (float) (( potencia(ladoTriangulo, 2) * raizquadrada(3) ) / 4);
        return areaDoTrianguloEquilatero;
    }

public static void main(String[] args) {
     
    
        //declara variavel

         float ladoTriangulo ;
         float areaDoTrianguloEquilatero;

        //recebe valor variavel

         imprimir("lado do triangulo");
         ladoTriangulo = TECLADO.nextFloat();


        //processando dados

          areaDoTrianguloEquilatero = CalcularAreaTrianguloEquilatero(ladoTriangulo);

         String resultadoFormatado = String.format("%.2f", areaDoTrianguloEquilatero); 

        //output

         imprimir("area:" + resultadoFormatado + "cm²");

 }
}