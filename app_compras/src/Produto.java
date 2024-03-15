public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return getNome() + " - " + getPreco();
    }

    @Override
    public int compareTo(Produto nomeProduto) {
        return this.getNome().compareTo(nomeProduto.getNome());
    }
}
