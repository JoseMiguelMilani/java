import java.util.Scanner;

public class trianguloTipo {

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

    public static String classificarTriangulo(float lado1, float lado2, float lado3) {
        String tipoTriangulo = "";

        //processar tipo triangulo
        if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
           tipoTriangulo = ("escaleno");
        }else{
        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1){
                tipoTriangulo = ("equilatero");
        }else{
                tipoTriangulo = ("isóceles");
        }
        }
                return tipoTriangulo;
        
    }


public static void main(String[] args) {
     
    
        //declara variavel

        float lado1 ;
        float lado2;
        float lado3;
        String tipoTriangulo = "";

        //recebe valor variavel

        imprimir("lado1 do triangulo");
        lado1 = TECLADO.nextFloat();

        imprimir("lado2 do triangulo");
        lado2 = TECLADO.nextFloat();

        imprimir("lado3 do triangulo");
        lado3 = TECLADO.nextFloat();


        //processando dados

        tipoTriangulo = classificarTriangulo(lado1, lado2, lado3);

        //saida
        imprimir(tipoTriangulo);

}
}
    
