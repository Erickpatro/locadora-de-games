
 class Jogo {
        String nome;
        String plataforma;
        boolean disponivel;

        // Construtor: cria um jogo novo
        public Jogo(String nome, String plataforma) {
            this.nome = nome;
            this.plataforma = plataforma;
            this.disponivel = true; // quando cria, o jogo sempre está disponível
        }

        // Alugar o jogo
        public void alugar() {
            if (disponivel) {
                disponivel = false;
                System.out.println(nome + " foi alugado!");
            } else {
                System.out.println(nome + " já está alugado.");
            }
        }

        // Devolver o jogo
        public void devolver() {
            disponivel = true;
            System.out.println(nome + " foi devolvido!");
        }

        // Mostrar informações do jogo
        public void exibirInfo() {
            System.out.println("Jogo: " + nome + " | Plataforma: " + plataforma + " | Disponível: " + disponivel);
        }
    }



