import java.util.ArrayList;

public class MaquinaVendas {

    private String nome;
    private ArrayList<Produto> produtosDisponiveis;
    private Utilizador utilizador; 

    public MaquinaVendas(String nome, ArrayList<Produto> produtos, Utilizador utilizador) {
        this.nome = nome;
        this.produtosDisponiveis = produtos;
        this.utilizador = utilizador;
    }

    public boolean existeProduto(String nome) {
        for (Produto p : produtosDisponiveis) {
            if (p.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean comprarProduto(String nome) {

        for (Produto p : produtosDisponiveis) {

            if (p.getNome().equals(nome)) {

                
                if (p.getquantidade() <= 0) {
                    return false; 
                }

                
                if (utilizador.getSaldo() < p.getPreco()) {
                    return false; 
                }

                
                utilizador.descontarSaldo(p.getPreco());

                
                p.comprar();

                return true; 
            }
        }

        return false; 
    }
}
