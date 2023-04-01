/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ramon
 */
import java.util.Scanner;


public class Main_main {

    public static void main(String[] args) {
        System.out.println("Vamos Brincar Com Uma Calculadora?");
        System.out.println("Sim(y) ou Não(n)?");

        Scanner inPut = new Scanner(System.in);
        String resposta;
        resposta = inPut.nextLine();

        for(int i=0; i < 10; i++) {
            if (resposta.equals("y")) {
                System.out.println("Poderia Digitar o Seu Nome?");
                Scanner inName = new Scanner(System.in);
                String userName;
                userName = inName.nextLine();
                System.out.println("Bem-Vindo " + userName + ", Agora Vamos Brincar");


                System.out.println("--------------------------------------------------");
                System.out.println("Nossas operações dísponiveis, são: ");
                System.out.println("1 - Adição");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");

                System.out.println("Por Favor Digitar a Operação Desejada!");
                Scanner vaLues = new Scanner(System.in);
                int calCal;
                calCal = vaLues.nextInt();
                System.out.println("Operação Escolhida: " + calCal);
                System.out.println("--------------------------------------------------");

                System.out.println("Agora Digite Os Valores Que Deseja Para a Operação");
                System.out.println("Digite o primeiro valor: ");
                Scanner val1 = new Scanner(System.in);
                int cal1;
                cal1 = val1.nextInt();
                System.out.println("Digite o segundo valor: ");
                Scanner val2 = new Scanner(System.in);
                int cal2;
                cal2 = val2.nextInt();

                System.out.println("O Primeiro Valor Digitado Foi: " + cal1);
                System.out.println("O Segundo Valor Digitado Foi: " + cal2);

                switch (calCal) {
                    case 1:
                        System.out.println("O Resultado da Sua Soma É: " + (cal1+cal2));
                        break;
                    case 2:
                        System.out.println("O Resultado da Sua Subtração É: " + (cal1-cal2));
                        break;
                    case 3:
                        System.out.println("O Resultado da Sua Multiplicação É: " + (cal1*cal2));
                        break;
                    case 4:
                        System.out.println("O Resultado da Sua Divisão É: " + (cal1/cal2));
                        break;
                    default:
                        System.out.println("ERRO!");
                }


            } else {
                System.out.println("Até mais!");
            }
        }
    }
}
