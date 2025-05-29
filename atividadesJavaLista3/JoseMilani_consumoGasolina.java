import java.util.Scanner;

public class JoseMilani_consumoGasolina {
    
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

    public static double calculoConsumo(double distancia, double litrosGastos ){
        double consumo;
        consumo = distancia*litrosGastos;
        return consumo;

    }

    public static void main(String[] args){

          //difinir as variaveis
          double distancia;
          double litrosGastos;
          double consumo;
  
  
          //receber variavel
  
          imprimir("quantos km andou");
          distancia = TECLADO.nextDouble();
  
          imprimir("quantos litros usou");
          litrosGastos = TECLADO.nextDouble();
  
          //processar
  
          consumo = calculoConsumo(distancia, litrosGastos);
  
          //output
  
          imprimir(conversaoString(consumo));

    }
}
