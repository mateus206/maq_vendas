public class TesteMaquina {
    public static void main(String[] args) {

        Utilizador user = new Utilizador(2.00);

        Bebida b1 = new Bebida(
            "Refrigerante Cósmico", 1.50, 5, "refri.png", "Fria"
        );

        Snack s1 = new Snack(
            "Batatas Explosivas", 1.20, 3, "batatas.png", true
        );

        Doce d1 = new Doce(
            "Chocolito Turbo", 1.00, 4, "choco.png", true
        );

        MaquinaVendas maquina = new MaquinaVendas();
        maquina.adicionarProduto(b1);
        maquina.adicionarProduto(s1);
        maquina.adicionarProduto(d1);

        System.out.println("Saldo atual: " + user.getSaldo());
        maquina.listarProdutos();

        maquina.comprarProduto(b1, user);

        System.out.println("Saldo após compra: " + user.getSaldo());

        user.carregarSaldo(2.00);

        maquina.comprarProduto(s1, user);
    }
}
    

