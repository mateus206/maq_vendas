public class Snack extends Produto{
  private boolean salgado;
  
    public Snack(String nome, double preco, int quantidade, String imagem,boolean salgado)
    {
        super(nome, preco, quantidade, imagem);
        this.salgado = salgado;
    }
    
    public boolean isSalgado() {
        return salgado;
    }
    
}

