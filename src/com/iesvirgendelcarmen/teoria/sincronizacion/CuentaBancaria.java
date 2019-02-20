package com.iesvirgendelcarmen.teoria.sincronizacion;

public class CuentaBancaria {
	private volatile int saldo;

	public synchronized int getSaldo() {
		return saldo;
	}

//	public void setSaldo(int saldo) {
//		this.saldo = saldo;
//	}

	public CuentaBancaria(int saldo) {
		super();
		this.saldo = saldo;
	}
	public synchronized void ingresar(int cantidad) {
		saldo += cantidad;
	}
	public synchronized void reintegrar(int cantidad) {
		saldo -= cantidad;
	}
	
}
