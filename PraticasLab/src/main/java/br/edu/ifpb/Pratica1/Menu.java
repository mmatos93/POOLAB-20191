package br.edu.ifpb.Pratica1;

import java.util.Scanner;

public class Menu {

    public void exibirMenu(){

        Calculadora c1 = new Calculadora();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        double n1, n2;
        while(opcao != 6) {

            System.out.println("###### Menu Calculadora #####");
            System.out.println("###### Digite uma opção: ####");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Sobre a calculadora");
            System.out.println("6. Sair");

            switch (opcao = ler.nextInt()) {
                case 1: {
                    System.out.println("Digite um numero: ");
                    n1 = ler.nextDouble();
                    System.out.println("Digite outro numero: ");
                    n2 = ler.nextDouble();
                    System.out.println("Resultado: " + c1.soma(n1,n2));
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("Digite um numero: ");
                    n1 = ler.nextDouble();
                    System.out.println("Digite outro numero: ");
                    n2 = ler.nextDouble();
                    System.out.println("Resultado: " + c1.subtrai(n1,n2));
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("Digite um numero: ");
                    n1 = ler.nextDouble();
                    System.out.println("Digite outro numero: ");
                    n2 = ler.nextDouble();
                    System.out.println("Resultado: " + c1.multiplica(n1,n2));
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("Digite um numero: ");
                    n1 = ler.nextDouble();
                    System.out.println("Digite outro numero: ");
                    n2 = ler.nextDouble();
                    System.out.println("Resultado: " + c1.divide(n1,n2));
                    System.out.println();
                    break;
                }
                case 5: {
                    System.out.println(c1.getDescricao());
                    System.out.println();
                    break;
                }
                case 6:{
                    System.out.println("Adeus!");
                    System.out.println();
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    System.out.println();
                }

            }


        }
    }

}
