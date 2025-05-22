
import java.util.Scanner;

public class losangulo{

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

        public static float CalcularAreaLosangulo(float diagonalMaior, float diagonalMenor){
        float areaLosangulo;
        areaLosangulo =( diagonalMaior * diagonalMenor ) / 2 ;
        return areaLosangulo;
    }


public static void main(String[] args) {
    
      //declara variavel

        float diagonalMaior ;
        float diagonalMenor ;
        float areaLosangulo; 

        //recebe valor variavel

        imprimir("diagonal maior");
        diagonalMaior = TECLADO.nextFloat();

        imprimir("diagonal menor");
        diagonalMenor = TECLADO.nextFloat();

        //processando dados

        areaLosangulo = CalcularAreaLosangulo(diagonalMaior, diagonalMenor);

        String resultadoFormatado = String.format("%.2f", areaLosangulo); 

        //output

        imprimir("area:" + resultadoFormatado + "cm²");
}
}