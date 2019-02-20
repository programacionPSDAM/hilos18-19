package com.iesvirgendelcarmen.teoria.sincronizacion;

public class IngresoDinero extends Thread {

	private CuentaBancaria cBancaria;
	private int cantidad;
	
	public IngresoDinero(CuentaBancaria cBancaria, int cantidad) {
		this.cBancaria = cBancaria;
		this.cantidad = cantidad;
	}

	@Override
	public void run() {
		try {
			
			Thread.sleep((long) (Math.random() * 200));
			this.cBancaria.ingresar(this.cantidad);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("Ingresando %d SALDO: %d%n",
				cantidad, cBancaria.getSaldo());

	}
	
	
	
	
}
