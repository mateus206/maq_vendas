public class Bebida extends Produto {
    private String temperatura;   

    public Bebida(String nome, double preco, int quantidade, String imagem, String temperatura) {
        // super chama o construtor da classe base Produto 
        super(nome, preco, quantidade, imagem);
        this.temperatura = temperatura;
    }
    
    public String getTemperatura() {
        return this.temperatura;
    }

    @Override
    public String toString() {
        return super.toString() + " | Temperatura: " + this.temperatura;
    }
}