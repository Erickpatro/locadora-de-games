public class main {

        public static void main(String[] args) {

            Jogo j1 = new Jogo("FIFA 24", "PlayStation");
            Jogo j2 = new Jogo("Halo", "Xbox");



            j1.exibirInfo();
            j2.exibirInfo();

           System.out.println("-------------");


            j1.alugar();
            j2.exibirInfo();

            System.out.println("-------------");


            j1.alugar();

            System.out.println("-------------");

            j1.devolver();
            j1.exibirInfo();
        }


    }



