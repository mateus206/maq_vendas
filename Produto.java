
/**
 * Escreva uma descrição da classe Produto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Produto
{
    private String nome;
    private double preco;
    private int quantidade_disponivel;
    private String imagem;
    /**
     * Construtor para objetos da classe Produto
     */
    public Produto(String nome, double preco, int quantidadedisponivel, String img)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.preco = preco;
        this.quantidade_disponivel = quantidade_disponivel;
        this.imagem = imagem;
    }
    
    public String getNome() {
        return nome;
    }
     
    public double getPreco()
    {
        return preco;
    }
    
    public int getQuantidade()
    {
        return quantidade_disponivel;
    }
    
    public String getimagem()
    {
        return imagem;
    }
    
    public boolean comprar() {
        if (this.quantidade_disponivel > 0) {
            this.quantidade_disponivel = this.quantidade_disponivel - 1;
            return true;
        }
        return false;
    }
    
    
}
    
    

