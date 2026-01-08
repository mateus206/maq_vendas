public class Utilizador {
    private double saldo;

    public Utilizador(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() { return saldo; }

    public void carregarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor; 
        }
    }

    public boolean descontarSaldo(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor; 
            return true;
        }
        return false;
    }
}