package br.ucb.a.lg.modelos;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver extends Thread {
    private Packet packet;

    public Receiver(Packet packet) {
        this.packet = packet;
    }

    public void run() {
        while(true) {
            String message = packet.receive();
            System.out.println("Mensagem recebida: " + message);

            if(message.equals("END")) {
                break;
            }

            int randoSec = ThreadLocalRandom.current().nextInt(1000, 5000);

            try {
                Thread.sleep(randoSec);
            } catch(InterruptedException e) {
                System.out.println("Thread foi interrompida!");
            }
        }
    }
}
