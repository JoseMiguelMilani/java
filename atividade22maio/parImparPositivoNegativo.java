import java.util.Scanner;
public class parImparPositivoNegativo {

 //definindo as funções

 public static void imprimir(String texto) {
    System.out.println(texto);
}

public final static Scanner TECLADO = new Scanner (System.in);

public static void main(String[] args) {
 
//declara variavel

 float valorRecebido ;

//recebe valor variavel

 imprimir("digite um valor");
 valorRecebido = TECLADO.nextFloat();


//processando dados e output

 if (valorRecebido == 0){
     imprimir("é 0");

 }else{
    //par ou impar

     if (valorRecebido % 2 == 0){
        imprimir("é par");
     }else{
        imprimir("é impar");
    }
    
    // positivo ou negativo
     if (valorRecebido > 0){
        imprimir("positivo");
     }else{
        imprimir("negativo");
    }
 }

}
}
