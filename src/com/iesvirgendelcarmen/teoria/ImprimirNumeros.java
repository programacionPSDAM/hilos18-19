package com.iesvirgendelcarmen.teoria;

public class ImprimirNumeros {

	public static void main(String[] args) {
		Thread hilo1 = new HilosNumeros();
		Thread hilo2 = new HilosNumeros();
		hilo2.setPriority(Thread.MAX_PRIORITY);
		hilo1.setPriority(Thread.MIN_PRIORITY);
		hilo1.start(); hilo2.start();
//		for (int i = 0; i < 1000; i++)
//			new HilosNumeros().start();
		System.out.println("Fin del hilo " 
				+ Thread.currentThread().getName());
	}

}
class HilosNumeros extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 20; i++) {
			System.out.println(i +" --- "
					+ Thread.currentThread().getName());
		}
	}
}