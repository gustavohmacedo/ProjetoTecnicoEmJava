package TesteTecnicoGFT.src.ProdutoLoja;

public abstract class Produto {

    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;

    public Produto() {
    } // construtor default

    public Produto(String nome, double preco, int quantidade) {
        this.nomeProduto = nome;
        this.precoProduto = preco;
        this.quantidadeProduto = quantidade;

    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return this.precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeProduto() {
        return this.quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return " Nome do Produto: " + this.getNomeProduto() + "\n"
                + String.format(" Preço do Produto: R$ %.2f", this.getPrecoProduto()) + "\n"
                + " Quantidade do Produto: " + this.getQuantidadeProduto();
    }

}
