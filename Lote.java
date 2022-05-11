public class Lote {
    public String id;
    public Produto produto;
    public int quantidade;

    public void lote(String id, int quantidade, Produto produto ) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }
    public String ToString(){
        return String.format("Id: %s, Produto: %s, Quantidade: %s", id, produto, quantidade);
    }
}
