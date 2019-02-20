package com.iesvirgendelcarmen.teoria.sincronizacion;

public class RetiradaDinero extends Thread{

	private CuentaBancaria cBancaria;
	private int cantidad;
	public RetiradaDinero(CuentaBancaria cBancaria, int cantidad) {
		super();
		this.cBancaria = cBancaria;
		this.cantidad = cantidad;
	}
	
	@Override
	public void run() {
		try {
			
			Thread.sleep((long) (Math.random() * 400));
			cBancaria.reintegrar(cantidad);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("Retirando %d SALDO: %d%n",
				cantidad, cBancaria.getSaldo());
	}
}
