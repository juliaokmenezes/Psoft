public class Produto {
    public String id ;
    public String nome;
    public String fabricante;

    public void produto(String id, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public String ToString(){
        return String.format("Produto: %s, Fabricante: %s", nome, fabricante);
    }
}
