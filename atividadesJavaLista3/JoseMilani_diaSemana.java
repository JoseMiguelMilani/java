import java.util.Scanner;

public class JoseMilani_diaSemana {

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

    public static String decidirDiaSemana(int numeroDia){
        String diaSemana = "";
        if (numeroDia == 1){
            diaSemana = "domingo";
        }else if (numeroDia == 2){
            diaSemana = "segunda-feira";
        }else if (numeroDia == 3){
            diaSemana = "terça-feira";
        }else if (numeroDia == 4){
            diaSemana = "quarta-feira";
        }else if (numeroDia == 5){
            diaSemana = "quinta-feira";
        }else if (numeroDia == 6){
            diaSemana = "sexta-feira";
        }else if (numeroDia == 7){
            diaSemana = "sabádo";
        }else{
            diaSemana = "valor invalido";
        }
         
        return diaSemana;
    }

    public static void main(String[] args) {
        
        //definir variavel
        String diaSemana = "";
        int numeroDia ;

        //receber variavel

        imprimir("dia da semana");
        numeroDia = TECLADO.nextInt();

        //processar

        diaSemana = decidirDiaSemana(numeroDia);

        //output

        imprimir("o dia " + numeroDia + " é " + diaSemana);

    }
}