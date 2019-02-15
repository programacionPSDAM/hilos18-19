package com.iesvirgendelcarmen.teoria;

public class EjemploHiloAnonimo {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			(new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(
							Thread.currentThread().getName());
				}
			})).start();;
		}
	}

}
