package TesteTecnicoGFT.src.ProdutoLoja;

import java.util.List;

public class Loja {
    private String nomeDaLoja;
    private String cnpjDaLoja;
    private List<Livro> livros;
    private List<VideoGame> videoGames;
    

    public Loja() {
    } // construtor default

    public Loja(String nome, String cnpj, List<Livro> books, List<VideoGame> games) {
        this.nomeDaLoja = nome;
        this.cnpjDaLoja = cnpj;
        this.livros = books;
        this.videoGames = games;

    }

    public String getNomeDaLoja() {
        return this.nomeDaLoja;
    }

    public void setNomeDaLoja(String nomeDaLoja) {
        this.nomeDaLoja = nomeDaLoja;
    }

    public String getCnpjDaLoja() {
        return this.cnpjDaLoja;
    }

    public void setCnpjDaLoja(String cnpjDaLoja) {
        this.cnpjDaLoja = cnpjDaLoja;
    }

    public List<Livro> getLivros() {
        return this.livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return this.videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros() {

        if (this.getLivros().isEmpty()) {
            System.out.println("\n A Loja " + this.getNomeDaLoja() + " não tem Livros no seu estoque. \n");

        } else {
            System.out.println(" A Loja " + this.getNomeDaLoja() + " possui estes livros para venda: \n");
            // getLivros().stream().forEach(System.out::println);

            getLivros().forEach(livro -> {

                System.out.println(" [Título: " + livro.getNomeProduto() + " ,"
                        + String.format(" Preço: %.2f", livro.getPrecoProduto()) + " ," + " Quantidade: "
                        + livro.getQuantidadeProduto() + "]\n");

            });

        }

    }

    public void listaVideoGames() {

        if (this.getVideoGames().isEmpty()) {
            System.out.println("\n A Loja " + this.getNomeDaLoja() + " não tem Videogames no seu estoque. \n");

        } else {
            System.out.println(" A Loja " + this.getNomeDaLoja() + " possui estes video-games para venda: \n");
            // getVideoGames().stream().forEach(System.out::println);

            getVideoGames().forEach(game -> {

                System.out.println(" [Título: " + game.getNomeProduto() + " ,"
                        + String.format(" Preço: %.2f", game.getPrecoProduto()) + " ," + " Quantidade: "
                        + game.getQuantidadeProduto() + "]\n");

            });

        }

    }
     double somaPatrimonioLivro;
     double somaPatrimonioVideo;
    public double calculaPatrimonio() {
       
        getLivros().forEach(livro -> somaPatrimonioLivro  += (livro.getPrecoProduto() * livro.getQuantidadeProduto()));

        getVideoGames().forEach(video -> somaPatrimonioVideo += (video.getPrecoProduto() * video.getQuantidadeProduto()));

        return somaPatrimonioLivro + somaPatrimonioVideo;

    }

    @Override
    public String toString() {
        return "\n Nome da Loja: " + getNomeDaLoja() + "\n" + " CNPJ:" + getCnpjDaLoja();

    }

}
