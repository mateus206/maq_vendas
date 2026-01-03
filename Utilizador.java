import java.util.ArrayList;
/**
 * Escreva uma descrição da classe Utilizador aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Utilizador
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private double saldo;
    private ArrayList<Produto> listaDeProdutos;
    /**
     * Construtor para objetos da classe Utilizador
     */
    public Utilizador(String nome, double saldo)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.saldo = saldo;
        
        this.listaDeProdutos = new ArrayList<Produto>();
    }
    
    public double getSaldo() {
        return saldo;
        }
        
       public void carregarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Carregamento efetuado com sucesso");
        }
    }
    
     public void comprarProduto(Produto produto) {

        // a) verificar saldo suficiente
        if (saldo >= produto.getPreco()) {

            // b) verificar se o produto está disponível
            if (produto.getQuantidade() > 0) {

                // c) diminuir saldo do utilizador
                saldo -= produto.getPreco();

                // d) diminuir quantidade do produto
                produto.comprar();

                // e) mensagem de sucesso
                System.out.println("Produto comprado com sucesso");

            } else {
                System.out.println("Produto esgotado");
            }

        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}