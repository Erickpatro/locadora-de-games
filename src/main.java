import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<Jogo> jogos = new ArrayList<>(); // lista que guarda todos os jogos
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            // Menu
            System.out.println("\n=== Menu Locadora ===");
            System.out.println("1. Cadastrar jogo");
            System.out.println("2. Listar jogos");
            System.out.println("3. Alugar jogo");
            System.out.println("4. Devolver jogo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    // Cadastrar jogo
                    System.out.print("Nome do jogo: ");
                    String nome = sc.nextLine();
                    System.out.print("Plataforma: ");
                    String plataforma = sc.nextLine();
                    jogos.add(new Jogo(nome, plataforma));
                    System.out.println("Jogo cadastrado!");
                    break;

                case 2:
                    // Listar jogos
                    System.out.println("\n--- Jogos cadastrados ---");
                    for (int i = 0; i < jogos.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        jogos.get(i).exibirInfo();
                    }
                    break;

                case 3:
                    // Alugar jogo
                    System.out.print("Escolha o número do jogo para alugar: ");
                    int alugar = sc.nextInt() - 1; // -1 porque a lista começa no 0
                    if (alugar >= 0 && alugar < jogos.size()) {
                        jogos.get(alugar).alugar();
                    } else {
                        System.out.println("Jogo inválido!");
                    }
                    break;

                case 4:
                    // Devolver jogo
                    System.out.print("Escolha o número do jogo para devolver: ");
                    int devolver = sc.nextInt() - 1;
                    if (devolver >= 0 && devolver < jogos.size()) {
                        jogos.get(devolver).devolver();
                    } else {
                        System.out.println("Jogo inválido!");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}
