public class Cartao extends Produto{
    private int numero;
    private String nome;
    private int codSeguranca;
    private double limiteCartao;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodSeguranca(int codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void recalcularSaldo(double valor) {
        this.limiteCartao -= valor;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", codSeguranca=" + codSeguranca +
                ", limiteCartao=" + limiteCartao +
                '}';
    }
}
