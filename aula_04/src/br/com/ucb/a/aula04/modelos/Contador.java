package br.com.ucb.a.aula04.modelos;

public class Contador {
    private Integer value;
    public Contador(Integer value) {
       this.value = value;
    }

    public void incremento() {
        this.value++;
    }

    public Integer getValue() {
        return this.value;
    }
}
