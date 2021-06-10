package TesteTecnicoGFT.src.ProdutoLoja;

import java.util.ArrayList;
import java.util.List;

public class ProjetoProdutoLoja {

    public static void main(String[] args) {

        // Instanciando os objetos da Classe Livro
        Livro ebookOne = new Livro("História do Brasil", 90.00f, 5, "Francisco de Assis Silva", "História", 150);
        Livro ebookTwo = new Livro("POO em Java", 120f, 2, "Prof. Donald", "EDUCATIVO", 125);

        // Instanciando os objetos da Classe VideoGame
        VideoGame playOne = new VideoGame("Play Station 5", 150, 3, "Sony", "Slim", true);
        VideoGame playTwo = new VideoGame("Xbox", 195, 3, "Microsoft", "One", false);

        // Lista de Livros
        List<Livro> listaDeLivro = new ArrayList<>();
        listaDeLivro.add(ebookOne);
        listaDeLivro.add(ebookTwo);
        // listaDeLivro.clear();

        // Lista de VideoGames
        List<VideoGame> listaDeGame = new ArrayList<VideoGame>();
        listaDeGame.add(playOne);
        listaDeGame.add(playTwo);
        // listaDeGame.clear();

        // Instanciando uma Loja
        Loja kabumStore = new Loja("Kabum", "33.014.556/0001-96", listaDeLivro, listaDeGame);
        System.out.println(kabumStore.toString());
        System.out.println("===========================[Cálculo de Impostos]==============================");
        System.out.println(ebookOne.toString());
        ebookOne.calculaImposto();

        System.out.println(ebookTwo.toString());
        ebookTwo.calculaImposto();

        System.out.println(playOne.toString());
        playOne.calculaImposto();

        System.out.println(playTwo.toString());
        playTwo.calculaImposto();
        System.out.println("=====================[Fim do teste Cálculo de Impostos]=======================\n");

        System.out.println("================[Listando Livros e Videogames]================================");
        kabumStore.listaLivros();
        kabumStore.listaVideoGames();
        System.out.println("================[Fim lista Livros e Videogames]================================\n");

        System.out.println("===================[Calculando Patrimonio da Loja]=============================");

        System.out.println("\n O Patrimônio da Loja " + kabumStore.getNomeDaLoja() + " é igual a R$ "
                +  kabumStore.calculaPatrimonio()+"\n");

        System.out.println("===============================================================================\n");

    }
}
