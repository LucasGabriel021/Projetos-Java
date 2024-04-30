package aula07;

import java.util.concurrent.Semaphore;
import java.util.Random;

public class Carro extends Thread {
	private Semaphore estacionamento;
	
	public Carro(String nome, Semaphore estacionamento) {
		super(nome);
		this.estacionamento = estacionamento;
	}
	
	public void run() {
		try {
			this.estacionamento.acquire();
			System.out.println(this.getName() + " entrou no estacionamento!");
			
			Thread.sleep(new Random().nextInt(10000) + 1000);
			
			System.out.println(this.getName() + " saiu do estacionamento!");
			
			this.estacionamento.release();
			                             
		} catch (InterruptedException e) {
			System.out.println("Thread Interropmpida!");
		}
		
	}
}
