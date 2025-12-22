
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
    private int qt_disp;
    private String img;
    /**
     * Construtor para objetos da classe Produto
     */
    public Produto(String nome, double preco, int qt_disp, String img)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.preco = preco;
        this.qt_disp = qt_disp;
        this.img = img;
    }
}