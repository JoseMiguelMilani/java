package oitoDeMaio;

import java.util.Scanner;

public class tipos {

    public static void main(String[] args) {
        
        //variaveis

        byte saldoGols;
        Short anoCivilização;
        int precoCarro;
        long dinheiroBilionario;

        double pi;
        boolean andouHoje;
        char continuar;


        //scanner

        Scanner ler = new Scanner(System.in); //cria função ler


        //byte


        System.out.println("qual é o saldo de gol do seu time");

        saldoGols = ler.nextByte();



        //short

        System.out.println("me diga um ano de uma civilização humana");

        anoCivilização = ler.nextShort();


        //int
        
        System.out.println("me de o valor de um carro");

        precoCarro = ler.nextInt();


        //long

        System.out.println("me fale a riqueza de algum bilionario");

        dinheiroBilionario = ler.nextLong();


        //float

        System.out.println("me fale uma divisão");

        float probabilidade = ler.nextFloat();
        //declara um float = 3.44F
    

        //double

        System.out.println("quer quantas casas de pi");

        pi = ler.nextDouble();


        //bolean

        System.out.println("você andou hoje");

        andouHoje = ler.nextBoolean();


        //char

        System.out.println("quer continuar [S/N]");

        continuar = ler.next().charAt(0);



        System.out.println(saldoGols);
        System.out.println(anoCivilização);
        System.out.println(precoCarro);
        System.out.println(dinheiroBilionario);
        System.out.println(probabilidade);
        System.out.println(pi);
        System.out.println(andouHoje);
        System.out.println(continuar);




    }
    
}
