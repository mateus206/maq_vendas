import java.util.ArrayList;

public class MaquinaVendasTest {
    public static void main(String[] args) {

        // Criar utilizador
        Utilizador user1 = new Utilizador("Mario");

        // Teste carregar saldo
        user1.carregarSaldo(35.50);
        System.out.println("Saldo atual: " + user1.getSaldo() + "€\n");

        // Criar produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto doce1 = new Doce("Mochi", 3.60, 6, "mochi.jpg", true);
        Produto snack1 = new Snack("Noodles", 4.60, 6, "noodles.jpg", false);
        Produto bebida1 = new Bebida("Monster Morango", 1.60, 6, "monster.jpg", "Fria");

        produtos.add(doce1);
        produtos.add(snack1);
        produtos.add(bebida1);

        MaquinaVendas maquina = new MaquinaVendas("Máquina Loures", produtos, user1);


        System.out.println("Existe Mochi? " + maquina.existeProduto("Mochi"));

        
        if (user1.getSaldo() >= doce1.getPreco() && maquina.ComprarProduto("Mochi")) {
            user1.descontarSaldo(doce1.getPreco());
            System.out.println("Compra de Mochi bem-sucedida!");
            System.out.println("Saldo restante: " + user1.getSaldo() + "€");
        }

        
        System.out.println("\nEsgotando o stock de Monster:");
        while (maquina.ComprarProduto("Monster Morango")) {
            user1.descontarSaldo(bebida1.getPreco());
            System.out.println("Compra realizada. Stock restante: " + bebida1.getquantidade());
        }
    }
}