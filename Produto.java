
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
    private int quantidade;
    private String img;
    /**
     * Construtor para objetos da classe Produto
     */
    public Produto(String nome, double preco, int qt_disp, String img)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.img = img;
    }
    
    public String getNome() {
        return nome;
    }
     
    public double getpreco()
    {
        return preco;
    }
    
    public int getquantidade()
    {
        return quantidade;
    }
    
    public String getimg()
    {
        return img;
    }
    
    public boolean comprar() {
        if (quantidade > 0) {
            quantidade--;
            return true;
        }
        return false;
    }
}
    
    

