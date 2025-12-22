
/**
 * Escreva uma descrição da classe Bebida aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Bebida extends Produto
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private static final String TIPO = "Bebida";
    private double qt_litros;
    /**
     * Construtor para objetos da classe Bebida
     */
    public Bebida(String nome, double preco, int qt_disp, String img, double qt_litros)
    {
        super(nome,preco,qt_disp,img);
        
        this.qt_litros = qt_litros;
    }
}