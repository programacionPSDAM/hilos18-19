package com.iesvirgendelcarmen.teoria;

public class CalcularSumaNumero {

	public static void main(String[] args) throws InterruptedException {
		CalculoNumerico hilo1 = new CalculoNumerico();
		CalculoNumerico hilo2 = new CalculoNumerico();
		CalculoNumerico hilo3 = new CalculoNumerico();
		CalculoNumerico hilo4 = new CalculoNumerico();
		hilo1.start();hilo2.start();
		hilo3.start();hilo4.start();
		hilo1.join(); hilo2.join(); hilo3.join(); hilo4.join();
		long resultado = hilo1.getResultado() + hilo2.getResultado() 
		+ hilo3.getResultado() + hilo4.getResultado();	
		System.out.println(resultado);
	}

}
class CalculoNumerico extends Thread {
	private long resultado = 0;
	@Override
	public void run() {
		for (long i = 0; i < 100_000_000; i++) {
			resultado++;
		}
	}
	public long getResultado() {
		return resultado;
	}
	
	
}