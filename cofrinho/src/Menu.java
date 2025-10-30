import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private Cofrinho cofrinho;

    public Menu(Cofrinho cofrinho){
        this.cofrinho = cofrinho;
        this.scanner = new Scanner(System.in);
    }

    public void printMainMenu() {
        int mainMenuOption = -1; // Inicia com um valor inválido para entrar no loop

        while (mainMenuOption != 0) {
            System.out.println("\n--- COFRINHO ---");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            try {
                mainMenuOption = scanner.nextInt();
                switch (mainMenuOption) {
                    case 1:
                        printAddMoedaMenu();
                        break;
                    case 2:
                        printRemoveMoedaMenu();
                        break;
                    case 3:
                        cofrinho.listagemMoedas();
                        break;
                    case 4:
                        double totalConvertido = cofrinho.totalConvertido();
                        System.out.printf("Total convertido para Real: R$ %.2f\n", totalConvertido);
                        break;
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                // Tratamento de erro para caso o usuário digite texto em vez de número
                System.out.println("Erro: Por favor, digite um número válido.");
                // Limpa o buffer do scanner para evitar loop infinito e reseta opção para continuar no loop.
                scanner.next();
                mainMenuOption = -1;
            }
        }
    }

    private void printAddMoedaMenu() {
        System.out.println("Escolha a Moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        int tipoMoeda = scanner.nextInt();
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        Moeda moeda = null;
        switch (tipoMoeda) {
            case 1:
                moeda = new Real(valor);
                break;
            case 2:
                moeda = new Dolar(valor);
                break;
            case 3:
                moeda = new Euro(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido!");
                return; // Encerra o método se a opção for inválida
        }
        cofrinho.adicionar(moeda);
        System.out.println("Moeda adicionada com sucesso!");
    }

    private void printRemoveMoedaMenu() {
        System.out.println("Escolha a Moeda a ser REMOVIDA:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        int moedaType = scanner.nextInt();

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        Moeda moedaToRemove = null;
        switch (moedaType) {
            case 1:
                moedaToRemove = new Real(valor);
                break;
            case 2:
                moedaToRemove = new Dolar(valor);
                break;
            case 3:
                moedaToRemove = new Euro(valor);
                break;
            default:
                System.out.println("Tipo de moeda inválido!");
                return;
        }
        // A remoção vai funcionar por causa do método 'equals' que implementamos na classe Moeda
        boolean removido = cofrinho.remover(moedaToRemove);
        if (removido) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Não foi encontrada uma moeda com esse valor para remover.");
        }
    }

}