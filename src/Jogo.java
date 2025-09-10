public class Jogo {
    String nome;
    String plataforma;
    boolean disponivel;

    public Jogo(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
        this.disponivel = true;
    }

    public void alugar() {
        if (disponivel) {
            disponivel = false;
            System.out.println(nome + " foi alugado!");
        } else {
            System.out.println(nome + " já está alugado.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println(nome + " foi devolvido!");
    }

    public void exibirInfo() {
        System.out.println("Jogo: " + nome + " | Plataforma: " + plataforma + " | Disponível: " + disponivel);
    }
}


