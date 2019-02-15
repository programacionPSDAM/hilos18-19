package com.iesvirgendelcarmen.teoria;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestNumerosPrimos {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		int numeroProcesadores = 
				Runtime.getRuntime().availableProcessors();
		System.out.println(numeroProcesadores);
		List<Long> listaNumeros = leerDatos();
//		ExecutorService controladorHilos =
//				Executors.newCachedThreadPool();
////		Executors.newFixedThreadPool(numeroProcesadores);
//
//		for (Long long1 : listaNumeros) {
//			Future<Boolean> f = controladorHilos.submit(
//					new Callable<Boolean>() {
//
//						@Override
//						public Boolean call() throws Exception {
//							// TODO Auto-generated method stub
//							return testPrimalidad(long1);
//						}
//					});
//			try {
//				System.out.printf("El nº %d es primos: %B%n",
//						long1, f.get());
//			} catch (InterruptedException | ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		controladorHilos.shutdown();
		for (Long long1 : listaNumeros) {
			System.out.printf("El nº %d es primos: %B%n",
					long1, testPrimalidad(long1));
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo de ejución: " + (fin - inicio));


	}

	protected static Boolean testPrimalidad(Long n) {
		if(n < 2) return false; 
		if(n == 2 || n == 3) return true; 
		if(n % 2 == 0 || n % 3 == 0) return false; 
		long sqrtN = (long)Math.sqrt(n)+1; 
		for(long i = 6L; i <= sqrtN; i += 6) { 
			if(n%(i-1) == 0 || n%(i+1) == 0) return false; 
		} 
		return true; 
	}

	private static List<Long> leerDatos() {
		List<Long> listaNumeros = new ArrayList<>();
		Path ruta = Paths.get("datos","numeros.txt");
		try (Scanner sc = new Scanner(ruta);){
			while (sc.hasNextLong())
				listaNumeros.add(sc.nextLong());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("leidos: " + listaNumeros.size());
		return listaNumeros;
	}










}
