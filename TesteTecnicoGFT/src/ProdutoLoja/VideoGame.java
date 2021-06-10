package TesteTecnicoGFT.src.ProdutoLoja;

public class VideoGame extends Produto implements Imposto {

    private String marcaVideoGame;
    private String modeloVideoGame;
    private boolean isUsado;

    public VideoGame() {
    } // construtor default

    public VideoGame(String nomeProduto, double precoProduto, int quantidadeProduto, String marca, String modelo,
            boolean isUsado) {

        super(nomeProduto, precoProduto, quantidadeProduto);
        this.marcaVideoGame = marca;
        this.modeloVideoGame = modelo;
        this.isUsado = isUsado;

    }

    public String getMarcaVideoGame() {
        return this.marcaVideoGame;
    }

    public void setMarcaVideoGame(String marcaVideoGame) {
        this.marcaVideoGame = marcaVideoGame;
    }

    public String getModeloVideoGame() {
        return this.modeloVideoGame;
    }

    public void setModeloVideoGame(String modeloVideoGame) {
        this.modeloVideoGame = modeloVideoGame;
    }

    public boolean isIsUsado() {
        return this.isUsado;
    }

    public boolean getIsUsado() {
        return this.isUsado;
    }

    public void setIsUsado(boolean isUsado) {
        this.isUsado = isUsado;
    }

    @Override
    public String toString() {
        // System.out.println("\n******************[Detalhes do Video
        // Game]******************");
        return super.toString() + "\n" + " Marca: " + getMarcaVideoGame() + "\n" + " Modelo: " + getModeloVideoGame()
                + "\n" + " Está Usado? " + getIsUsado() + "\n";
    }

    @Override
    public double calculaImposto() {
        if (getIsUsado() == false) {
            System.out.println(" O Video-Game é NOVO, portanto inside uma taxa de 45% sobre seu preço. ");
            System.out.printf(" Valor do acréscimo: R$ %.2f", (getPrecoProduto() * 0.45));
            System.out.printf("\n Valor do Video Game após a taxa: R$ %.2f",
                    (getPrecoProduto() + (getPrecoProduto() * 0.45)));
            System.out.printf("\n Valor total a pagar: R$ %.2f\n",
                    ((getPrecoProduto() + (getPrecoProduto() * 0.45)) * getQuantidadeProduto()));
            System.out.println("**************************************************************************");
            return (getPrecoProduto() + (getPrecoProduto() * 0.45)) * getQuantidadeProduto();

        } else {
            System.out.println(" O Video-Game é USADO, portanto inside uma taxa de 25% sobre seu preço. ");
            System.out.printf("\n Valor do acréscimo: R$ %.2f", (getPrecoProduto() * 0.25));
            System.out.printf("\n Valor do Video Game após a taxa: R$ %.2f",
                    (getPrecoProduto() + (getPrecoProduto() * 0.25)));
            System.out.printf("\n Valor total a pagar: R$ %.2f\n",
                    ((getPrecoProduto() + (getPrecoProduto() * 0.25)) * getQuantidadeProduto()));
            System.out.println("**************************************************************************");
            return (getPrecoProduto() + (getPrecoProduto() * 0.25)) * getQuantidadeProduto();

        }

    }

}
