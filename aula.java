
import java.util.Scanner;

public class aula {

    // output
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    // input
    public final static Scanner TECLADO = new Scanner(System.in);

    // definindo funções
    public static double lerValorReal() {
        double valor;
        valor = TECLADO.nextDouble();
        return valor;
    }

    //
    public static int lerValorInteiro() {
        int valor;
        valor = TECLADO.nextInt();
        return valor;
    }

    //
    public static boolean LerBoolean() {
        boolean valor;
        valor = TECLADO.nextBoolean();
        return valor;
    }
    //
    public static char lercaractere(){
        char valor;
        valor = TECLADO.nextLine().charAt(0);
        return valor;
    }
    //
    public static double lerDouble() {
        double valor;
        valor = TECLADO.nextDouble();
        return valor;
    }


    public static void main(String[] args) {

        // receber byte
        imprimir("sua idade");
        String nome = TECLADO.nextLine();
        imprimir("sua idade " + nome);

        // double
        imprimir("qual o valor de pi");
        double PI = TECLADO.nextDouble();
        System.out.println(PI);

        // receber short
        imprimir("dia da semana");
        byte diaDaSemana = TECLADO.nextByte();
        System.out.println(diaDaSemana);

        // recebe int
        imprimir("valor de um carro ");
        int valorCarro = TECLADO.nextInt();
        System.out.println(valorCarro);

        // receber char
        imprimir("quer continuar");
        char continuar = TECLADO.next().charAt(0);
        System.out.println(continuar);

        // receber booleab
        imprimir("deu certo?");
        boolean boleano = TECLADO.nextBoolean();
        System.out.println(boleano);

        // apenas o char que não tem o nextblablabla(), entao usamos o chatAT para
        // ajudar
    }

}
