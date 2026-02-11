public class Snack extends Produto {
    private boolean salgado;

    public Snack(String nome, double preco, int quantidade, String imagem, boolean salgado) {
 
        super(nome, preco, quantidade, imagem);
        this.salgado = salgado;
    }

    public boolean getSalgado() {
        return salgado;
    }

    @Override
    public String toString() {
        return super.toString() + " | Sabor: " + this.salgado;
    }
}
