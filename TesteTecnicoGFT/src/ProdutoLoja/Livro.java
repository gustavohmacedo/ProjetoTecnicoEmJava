package TesteTecnicoGFT.src.ProdutoLoja;

public class Livro extends Produto implements Imposto {

    private String autorLivro;
    private String temaLivro;
    private int quantidadePaginasLivro;

    public Livro() {
    } // construtor default

    public Livro(String nomeProduto, double precoProduto, int quantidadeProduto, String autor, String tema,
            int qtdPaginasLivro) {
        super(nomeProduto, precoProduto, quantidadeProduto);
        this.autorLivro = autor;
        this.temaLivro = tema;
        this.quantidadePaginasLivro = qtdPaginasLivro;

    }

    public String getAutorLivro() {
        return this.autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getTemaLivro() {
        return this.temaLivro;
    }

    public void setTemaLivro(String temaLivro) {

        this.temaLivro = temaLivro;
    }

    public int getQuantidadePaginasLivro() {
        return this.quantidadePaginasLivro;
    }

    public void setQuantidadePaginasLivro(int quantidadePaginasLivro) {
        this.quantidadePaginasLivro = quantidadePaginasLivro;
    }

    @Override
    public String toString() {
        // System.out.println("\n******************[Detalhes do Livro]**********************");
        return super.toString() + "\n" + " Autor do Livro: " + getAutorLivro() + "\n" + " Tema do Livro: "
                + getTemaLivro() + "\n" + " Quantidade de páginas: " + getQuantidadePaginasLivro() + "\n";
    }

    @Override
    public double calculaImposto() {
        if (getTemaLivro().equalsIgnoreCase("educativo")) {
            System.out.println(" O tema do livro é 'Educativo', portanto não inside taxa de imposto sobre ele. ");
            System.out.printf("\n Valor total a pagar: R$ %.2f\n",getPrecoProduto()*getQuantidadeProduto());
            System.out.println("\n**************************************************************************");
            return 0;
        } else {
            System.out.println(" Atenção! Produto tem um acréscimo de 10% de imposto sobre o seu valor! ");
            System.out.printf(" Valor do acréscimo: R$ %.2f", (getPrecoProduto() * 0.1));
            System.out.printf("\n Valor do Livro após a taxa: R$ %.2f",
                    (getPrecoProduto() + (getPrecoProduto() * 0.1)));
            System.out.printf("\n Valor total a pagar: R$ %.2f\n",
                    (getPrecoProduto() + (getPrecoProduto() * 0.1)) * getQuantidadeProduto());
            System.out.println("\n**************************************************************************");
            return (getPrecoProduto() + (getPrecoProduto() * 0.1)) * getQuantidadeProduto();

        }

    }

}
