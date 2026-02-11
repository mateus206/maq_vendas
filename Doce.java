public class Doce extends Produto 
{
    private boolean acucar;

    public Doce(String nome, double preco, int quantidade, String imagem, boolean acucar) 
    {
        super(nome, preco, quantidade, imagem);
        this.acucar = acucar;
    }

    @Override
    public String toString() 
    {
        return super.toString() + " | Categoria: Doce | Sabor: " + acucar;
    }
}
