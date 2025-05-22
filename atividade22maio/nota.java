import java.util.Scanner;

public class nota {


 //definindo as funções

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public final static Scanner TECLADO = new Scanner (System.in);

public static void main(String[] args) {
     
    
    //declara variavel

     float nota ;

    //recebe valor variavel

     imprimir("nota");
     nota = TECLADO.nextFloat();


    //processando dados

     if (nota >= 7){
        imprimir("passou");
     }else{
        imprimir("não passou");
     }

}
}
