import java.util.Scanner;

public class JoseMilani_casoEleitoral {
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

    public static String casoEleitoral(int idade){
        String classe = "";

        if (idade < 16){
            classe = "não eleitor";
        }else if (idade < 18 || idade > 65 ){
            classe = "eleitor facultativo";
        }else{
            classe = "eleitor obrigatorio";
        }
        return classe;
        }
    public static void main(String[] args) {
        
        //definir variavel
        String classe = "";
        int idade ;

        //receber variavel

        imprimir("numero");
        idade = TECLADO.nextInt();

        //processar

        classe = casoEleitoral(idade);

        //output

        imprimir(classe);

    }
}
