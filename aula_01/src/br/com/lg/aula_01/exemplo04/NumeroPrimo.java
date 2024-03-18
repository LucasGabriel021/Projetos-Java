package br.com.lg.aula_01.exemplo04;

public class NumeroPrimo implements Runnable{
    private int numInicial;
    private int numFinal;

    public NumeroPrimo(int numInicial, int numFinal) {
        this.numInicial = numInicial;
        this.numFinal = numFinal;
    }

    private boolean isPrimo(int numero) {
        if(numero <= 1) {
            return false;
        }
        for(int i = 2; i * i <= numero; i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        for(int count = numInicial; count <= numFinal; count++) {
            if(isPrimo(count)) {
                System.out.println(count + " ");
            }
        }
        System.out.println();
    }
}
