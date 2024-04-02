package br.ucb.a.lg.principal;

import br.ucb.a.lg.modelos.Packet;
import br.ucb.a.lg.modelos.Receiver;
import br.ucb.a.lg.modelos.Sender;

public class Main {
    public static void main(String[] args) {
        String[] messages = {
          "primeira mensagem",
          "segunda mensagem",
          "terceira mensagem",
          "quarta mensagem",
          "quinta mensagem",
          "END"
        };

        Packet packet = new Packet();

        Sender sender = new Sender(packet, messages);
        Receiver receiver = new Receiver(packet);

        sender.start();
        receiver.start();
    }
}
