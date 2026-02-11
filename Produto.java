
public class Produto
{
    
    private String nome;
    
    
    private double preco;
    

    private int quantidade;
    
    
    private String imagem;

    
    public Produto(String nome, double preco, int quantidade, String imagem)
    {
    
        this.nome = nome;
        
        
        this.preco = preco;
        
        
        this.quantidade = quantidade;
        
        
        this.imagem = imagem;
    }
    
    
    public String getNome() 
    {
        return nome;
    }
     
    public double getPreco()
    {
        return preco;
    }
    
    public int getquantidade()
    {
        return quantidade;
    }
    
    public String getimagem()
    {
        return imagem;
    }
    
    public boolean comprar() 
    {
        
        if (this.quantidade > 0) 
        {
            
            this.quantidade = this.quantidade - 1;
            
           
            return true;
        }
        
        
        return false;
    }
}
