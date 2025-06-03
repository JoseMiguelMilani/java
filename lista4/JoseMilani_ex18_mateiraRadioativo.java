
import java.util.Scanner;

public class JoseMilani_ex18_mateiraRadioativo {

public static void imprimir(String texto) {
    System.out.println(texto);
}

public static void imprimirNumero(double texto){
        System.out.println(texto);
}

public final static Scanner TECLADO = new Scanner (System.in);

public static double lerValorReal() {
    double valor;
    valor = TECLADO.nextDouble();
    return valor; 
}

public static double decairMassa(double massa){

    massa = (massa/2);

    return massa;
}


public static void main(String[] args) {
    //iniciando variavel
    double massa;
    int tempo = 0;

    imprimir("qual a massa");
    massa = TECLADO.nextDouble();

    //processamento
    while (massa >= 0.05) {
        tempo += 1;
        massa = decairMassa(massa);
        imprimirNumero(massa);
    }
    
    //output

    imprimir("demerou " + tempo + " segundo");
}
}
