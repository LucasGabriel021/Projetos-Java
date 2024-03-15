import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Cartao cartao = new Cartao();
        List<Produto> carrinhoDeCompras = new ArrayList<Produto>();

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Menu");
            System.out.println("|1| - Cadastrar forma de pagamento");
            System.out.println("|2| - Comprar produtos");
            System.out.println("|3| - Histórico de compras");
            System.out.println("|4| - Encerrar programa");
            System.out.println("Informe a opção desejada: ");
            opcao = l.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Cadastro do cartão:");
                    System.out.println("Informe os dados do seu cartão abaixo para realizar a compra:");
                    System.out.println("Informe o número do seu cartão: ");
                    cartao.setNumero(l.nextInt());
                    l.nextLine();
                    System.out.println("Informe o nome do cartão: ");
                    cartao.setNome(l.nextLine());
                    System.out.println("Informe o código de segurança do cartão: ");
                    cartao.setCodSeguranca(l.nextInt());
                    System.out.println("Informe o limite do seu cartão: ");
                    cartao.setLimiteCartao(l.nextDouble());

                    break;
                case 2:
                    Produto produtoAtual = new Produto();
                    System.out.println("Comprar");

                    l.nextLine();
                    System.out.println("Informe o produto que deseja comprar: ");
                    produtoAtual.setNome(l.nextLine());
                    System.out.println("Informe o valor da compra: ");
                    produtoAtual.setPreco(l.nextDouble());

                    if(cartao.getLimiteCartao() < produtoAtual.getPreco()) {
                        System.out.println("Saldo insuficiente");
                        if(carrinhoDeCompras.size() != 0) {
                            System.out.println("Compras realizadas: ");
                            Collections.sort(carrinhoDeCompras);

                            for (Produto item: carrinhoDeCompras) {
                                System.out.println(item);
                            }
                        }
                        System.out.println("Saldo do cartão: " + cartao.getLimiteCartao());
                    } else {
                        cartao.recalcularSaldo(produtoAtual.getPreco());
                        carrinhoDeCompras.add(produtoAtual);
                        System.out.println("Compra realizada com sucesso!");
                    }

                    break;
                case 3:
                    System.out.println("Histórico de compras: ");
                    Collections.sort(carrinhoDeCompras);
                    for (Produto item: carrinhoDeCompras) {
                        System.out.println(item);
                    }
                    break;
                case 4:
                    System.out.println("Programa encerrado");
                    break;
            }
        }
    }
}
