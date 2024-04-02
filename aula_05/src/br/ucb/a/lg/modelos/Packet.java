package br.ucb.a.lg.modelos;

public class Packet {
    boolean isSending = true;
    private String message;

    public String getMessage() {
        return message;
    }

    public void send(String message) {
        while(!this.isSending) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("Thread foi interrompida!");
            }
        }
    }

    public String receive() {
        while(!this.isSending) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("Thread foi interrompida!");
            }
        }
        System.out.println("mensagem recebida: " + this.message);
        this.isSending = true;
        notify();
        return this.message;
    }
}
