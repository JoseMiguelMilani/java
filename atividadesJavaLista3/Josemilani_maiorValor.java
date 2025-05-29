import java.util.Scanner;

public class Josemilani_maiorValor {
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

    public static int acharMaior(int valor1, int valor2, int valor3 ){
        int maior = 0;
        if (valor1 > valor2){
            if (valor1 > valor3){
                maior = valor1;
            }
        }else if(valor2 > valor3){
            maior = valor2;
        }else{
            maior = valor3;
        }
        return maior;
    }

    

    public static void main(String[] args){

          //difinir as variaveis
          int valor1;
          int valor2;
          int valor3;
          int maior;
  
  
          //receber variavel
  
          imprimir("valor1");
          valor1 = TECLADO.nextInt();
  
          imprimir("valor2");
          valor2 = TECLADO.nextInt();

          imprimir("valor3");
          valor3 = TECLADO.nextInt();
  
          //processar
  
          maior = acharMaior(valor1, valor2, valor3);
  
          //output
  
          imprimir(conversaoString(maior));

    }
}


