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
}