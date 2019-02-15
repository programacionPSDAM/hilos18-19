package com.iesvirgendelcarmen.teoria;

public class HilosDemonio {

	public static void main(String[] args) {
		System.out.println(
				"En el hilo " + Thread.currentThread().getName());
		Thread hilo1 = new Thread(new SegundoPlano());
		Thread hilo2 = new Thread(new SegundoPlano());
		Thread hilo3 = new Thread(new SegundoPlano());
		Thread hilo4 = new Thread(new SegundoPlano());
		hilo1.setDaemon(true); hilo2.setDaemon(true);
		hilo1.start(); hilo2.start(); //hilos demonio
		hilo3.start(); hilo4.start();  //hilos usuario
		try {
			Thread.sleep(10_000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(
				"Acabado el hilo " + Thread.currentThread().getName());
	}

}
class SegundoPlano implements Runnable{

	@Override
	public void run() {
		System.out.println(
				"En el hilo " + Thread.currentThread().getName());
		try {
			Thread.sleep(15_000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(
				"Acabado el hilo " + Thread.currentThread().getName());
	}
	
}