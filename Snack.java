public class Snack extends Produto {
    private boolean salgado;

    public Snack(String nome, double preco, int quantidade, String imagem, boolean salgado) {
        // super chama o construtor da classe base Produto [cite: 44]
        super(nome, preco, quantidade, imagem);
        this.salgado = salgado;
    }

    public boolean isSalgado() {
        return salgado;
    }

    @Override
    public String toString() {
        // Usamos um operador ternário para transformar o boolean em texto legível
        String tipo = this.salgado ? "Salgado" : "Doce";
        
        // super.toString() aproveita o que já foi escrito na classe Produto 
        return super.toString() + " | Sabor: " + tipo;
    }
}
