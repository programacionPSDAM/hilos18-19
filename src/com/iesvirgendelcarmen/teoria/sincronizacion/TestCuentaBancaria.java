package com.iesvirgendelcarmen.teoria.sincronizacion;

import java.util.Random;

public class TestCuentaBancaria {
	private static CuentaBancaria cBancaria = 
			new CuentaBancaria(10_000);
	public static void main(String[] args) {
		CuentaBancaria cBancaria = new CuentaBancaria(100);
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int cantidadRetirar = 10 * random.nextInt(10);
			(new RetiradaDinero(cBancaria,cantidadRetirar)).start();
		//	System.out.printf("Retirando %d, SALDO %d%n", 
		//			cantidadRetirar, cBancaria.getSaldo());
			int cantidadIngresar = 10 * random.nextInt(10);
			(new IngresoDinero(cBancaria, cantidadIngresar)).start();
		//	System.out.printf("Ingresando %d, SALDO %d%n", 
		//			cantidadIngresar, cBancaria.getSaldo());

		}

	}

}
