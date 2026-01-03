public class Bebida extends Produto{
 private String temperatura;   

    public Bebida(String nome, double preco, int quantidade, String imagem)
    {
        super(nome, preco, quantidade, imagem);
        this.temperatura = temperatura;
    }
    
    public String getTemperatura() 
    {
        return temperatura;
    }
}
