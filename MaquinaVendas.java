import java.util.ArrayList;
/**
 * Escreva uma descrição da classe MaquinaVendas aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MaquinaVendas
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String  nome;
    private String utilizador;
    private ArrayList<Produto> produtosDisponiveis;
    
    /**
     * Construtor para objetos da classe MaquinaVendas
     */
    public MaquinaVendas(String nome, ArrayList<Produto> produtos)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.produtosDisponiveis = produtos;
        this.utilizador=utilizador;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public boolean existeProduto(String nome)
    {
        // escreva seu código aqui
        int i = 0;
        boolean encontrado = false;
        
        while  (i < produtosDisponiveis.size() && encontrado == false)
        {
            String nomeProduto = produtosDisponiveis.get(i).getNome();
            
            if (nomeProduto.equals(nome))
            
            encontrado = true;
            
            else i++;
        }
        
        return encontrado;
    }
    
    public boolean venderProduto(String nome)
    {
        int i = 0;
        
        boolean encontrado = false;
        
        while  (i < produtosDisponiveis.size() && encontrado == false)
        {
            Produto p = produtosDisponiveis.get(i);
            
            String nomeProduto = p.getNome();
            
            if (nomeProduto.equals(nome))
            {
                encontrado = true ;
                
                boolean compraSucesso = p.comprar();
                
                if (compraSucesso == true)
                {
                    // retirar saldo ao user
                    
                    return true;
                }
                
                return false;
            }
            
            else i++;
        }
        
        return encontrado;
        
    }
}