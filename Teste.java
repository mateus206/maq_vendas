import java.util.ArrayList;
/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Teste
{
    public static void main (String[] agrs)
    {
            ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
            Produto p1 = new Produto("sandes mista",2.50,5,"");
            listaProdutos.add(p1);
            
            Produto p2 = new Bebida("fanta",3,4,"");
            listaProdutos.add(p2);
            
            Produto p3 = new Snack("pringles",5.0,6,"",true);
            listaProdutos.add(p3);
            
            MaquinaVendas maquina = new MaquinaVendas("metro saldanha",listaProdutos);
            
            Utilizador u1 = new Utilizador("mateus",20);
            System.out.println(p3.getQuantidade());
            u1.comprarProduto(maquina,p3);
            System.out.println(p3.getQuantidade());
            System.out.println(u1.getSaldo());
        
    }
}