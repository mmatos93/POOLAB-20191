package br.edu.ifpb.Pratica3;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void exibirMenu() {

        ContaCorrente c1 = new ContaCorrente(123, "Matheus Matos", 300.00);
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        double valor;
        while (opcao != 5) {

            System.out.println("###### Menu Banco ###########");
            System.out.println("###### Digite uma opção: ####");
            System.out.println("1. Saque");
            System.out.println("2. Deposito");
            System.out.println("3. Saldo na tela");
            System.out.println("4. Extrato na tela");
            System.out.println("5. Sair");

            switch (opcao = ler.nextInt()) {
                case 1:{
                    System.out.println("Quanto deseja sacar?");
                    valor = ler.nextDouble();
                    if(c1.sacar(valor)) System.out.println("Operação realizada com sucesso!");
                    else System.out.println("Erro na operação, digite um valor válido!");
                    System.out.println();
                    break;
                }
                case 2:{
                    System.out.println("Quanto deseja depositar?");
                    valor = ler.nextDouble();
                    if(c1.depositar(valor)) System.out.println("Operação realizada com sucesso!");
                    else System.out.println("Erro na operação, digite um valor válido!");
                    System.out.println();
                    break;
                }
                case 3:{
                    System.out.println("Saldo disponível: " + c1.getSaldo());
                    System.out.println();
                    break;
                }
                case 4:{
                    System.out.println("Extrato:");
                    for(int i=0; i<c1.registro.size(); i++){
                        System.out.println(c1.registro.get(i));
                    }
                    System.out.println();
                    break;
                }
                case 5:{
                    System.out.println("Obrigado por usar nossos serviços!");
                    System.out.println();
                    break;
                }

            }
        }
    }
}