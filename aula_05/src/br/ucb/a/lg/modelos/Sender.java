package br.ucb.a.lg.modelos;

import java.util.concurrent.ThreadLocalRandom;

public class Sender extends Thread {
    private Packet packet;
    private String[] messages;

    public Sender(Packet packet, String[] messages) {
        this.packet = packet;
        this.messages = messages;
    }

    public void run() {
        for(String message: this.messages) {
            System.out.println("Mensagem enviada: " + message);
            packet.send(message);

            int randomSec = ThreadLocalRandom.current().nextInt(1000, 5000);

            try {
                Thread.sleep(randomSec);
            } catch(InterruptedException e) {
                System.out.println("Thread foi interrompida!");
            }
        }
    }
}
