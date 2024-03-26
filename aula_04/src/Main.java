import br.com.ucb.a.aula04.modelos.Contador;
import br.com.ucb.a.aula04.modelos.Incremento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (true) {

            Contador c = new Contador(0);
            Incremento inc = new Incremento(c);
            Incremento inc1 = new Incremento(c);
            Incremento inc2 = new Incremento(c);
            Incremento inc3 = new Incremento(c);

            inc.start();
            inc1.start();
            inc2.start();
            inc3.start();

            inc.join();
            inc1.join();
            inc2.join();
            inc3.join();

            if (c.getValue() != 2) {
                System.out.println("Valor do contador: " + c.getValue());
                break;
            }
        }
    }
}
