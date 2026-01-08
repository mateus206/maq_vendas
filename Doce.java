public class Doce extends Produto {

    public Doce(String nome, double preco, int quantidade, String imagem) {
        // super chama o construtor da classe base Produto 
        super(nome, preco, quantidade, imagem);
    }

    @Override
    public String toString() {
        // super.toString() aproveita o nome, preço e quantidade da classe base 
        return super.toString() + " | Categoria: Doce";
    }
}
