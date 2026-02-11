import java.util.ArrayList;

public class TestMaquinaVendas {

    public static void main(String[] args) {

        Utilizador user = new Utilizador("João");
        user.carregarSaldo(20.0);
        System.out.println(user);

        
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Snack("Chips", 5.0, 3, "chips.jpg", true));
        produtos.add(new Doce("Chocolate", 3.0, 2, "chocolate.jpg", true));
        produtos.add(new Bebida("Água", 2.0, 1, "agua.jpg", "Fria"));

        MaquinaVendas maquina = new MaquinaVendas("Máquina 1", produtos, user);

        
        System.out.println("\nComprar Chocolate: " + maquina.comprarProduto("Chocolate"));
        System.out.println("Saldo: " + user.getSaldo());

        System.out.println("Comprar Água: " + maquina.comprarProduto("Água"));
        System.out.println("Saldo: " + user.getSaldo());

        System.out.println("Comprar Chips: " + maquina.comprarProduto("Chips"));
        System.out.println("Saldo: " + user.getSaldo());

        
        System.out.println("\nProdutos restantes:");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
