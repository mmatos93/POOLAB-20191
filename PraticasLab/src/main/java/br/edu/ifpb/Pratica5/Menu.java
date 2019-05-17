package br.edu.ifpb.Pratica5;

import java.util.Scanner;

public class Menu {

    public void exibirMenu() {

        ContaCorrente c1 = new ContaCorrente(123, "Matheus Matos", 300.00);
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        double valor;
        while (opcao != 5) {
            try {

                System.out.println("###### Menu Banco ###########");
                System.out.println("###### Digite uma opção: ####");
                System.out.println("1. Saque");
                System.out.println("2. Deposito");
                System.out.println("3. Saldo na tela");
                System.out.println("4. Extrato na tela");
                System.out.println("5. Sair");


                switch (opcao = ler.nextInt()) {

                    case 1: {
                        try {
                            System.out.println("Quanto deseja sacar?");
                            valor = ler.nextDouble();
                            if (c1.sacar(valor)) System.out.println("Operação realizada com sucesso!");
                            else if (valor > c1.getSaldo()) throw new SaldoInsuficienteException();
                            else if (valor < 0) throw new QuantiaNegativaException();
                            break;
                        } catch (SaldoInsuficienteException e){
                            System.out.println("Erro no saque!\nDigite um valor dentro do seu saldo!\n");
                            continue;
                        }
                        catch (QuantiaNegativaException e){
                            System.out.println("Erro no saque!\nDigite um valor positivo!\n");
                            continue;
                        }
                    }
                    case 2: {
                        try {
                            System.out.println("Quanto deseja depositar?");
                            valor = ler.nextDouble();
                            if (c1.depositar(valor)) System.out.println("Operação realizada com sucesso!");
                            else throw new QuantiaNegativaException();
                            break;
                        } catch ( QuantiaNegativaException e ){
                            System.out.println("Erro no deposito!\nDigite um valor positivo!\n");
                            continue;

                        }
                    }
                    case 3: {
                        System.out.println("Saldo disponível: " + c1.getSaldo());
                        System.out.println();
                        break;
                    }
                    case 4: {
                        System.out.println("Extrato:");
                        for (int i = 0; i < c1.registro.size(); i++) {
                            System.out.println(c1.registro.get(i));
                        }
                        System.out.println();
                        break;
                    }
                    case 5: {
                        System.out.println("Obrigado por usar nossos serviços!");
                        System.out.println();
                        break;
                    }
                    default: throw new EntradaInvalidaException();
                }
            } catch (EntradaInvalidaException e){
                System.out.println("Valor inválido!! Digite um novo valor");
                //continue;
            }
        }
    }
}