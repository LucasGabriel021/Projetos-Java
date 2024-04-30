package aula07;

import java.util.concurrent.Semaphore;

public class Main {
	public static void main(String[] args) {
		Semaphore estacionamneto = new Semaphore(10);
		
		for(int i = 0; i < 20; i++) {
			new Carro("carro " + i, estacionamneto).start();
		}
	}
}
