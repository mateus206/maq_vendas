public class Snack extends Produto {
    private boolean salgado;

    public Snack(String nome, double preco, int quantidade, String imagem, boolean salgado) {
        // super chama o construtor da classe base Produto 
        super(nome, preco, quantidade, imagem);
        this.salgado = salgado;
    }

    public boolean isSalgado() {
        return salgado;
    }

    @Override
    public String toString() {
        
        String tipo = this.salgado ? "Salgado" : "Doce";
        
        return super.toString() + " | Sabor: " + tipo;
    }
}
