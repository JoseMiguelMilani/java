
import java.util.Scanner;

public class trapezio{

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

        public static float CalcularAreaTrapezio(float baseMaior, float baseMenor, float altura){
        float areaTrapezio;
        areaTrapezio =( ( baseMaior + baseMenor ) * altura )/ 2 ;
        return areaTrapezio;
    }

public static void main(String[] args) {
     
    
        //declara variavel

         float baseMaior ;
         float baseMenor ;
         float altura;
         float areaLosangulo; 

        //recebe valor variavel

         imprimir("base maior");
         baseMaior = TECLADO.nextFloat();

         imprimir("base menor");
         baseMenor = TECLADO.nextFloat();

         imprimir("altura");
         altura = TECLADO.nextFloat();

        //processando dados

         areaLosangulo = CalcularAreaTrapezio(baseMaior, baseMenor, altura);

         String resultadoFormatado = String.format("%.2f", areaLosangulo); 

        //output

         imprimir("area:" + resultadoFormatado + "cm²");

 }
}