package Ejercicio3;

import java.util.Random;

public class NumeroAleatorio {	
	// Creamos variables estaticas
	private final int num1 = 0;
	private final int num2 = 999;
	
	// Creamos variables
	private int numAleatorio;
	
	// Constructor por defecto
	public int numAleatorio() {
		return this.numAleatorio = numeroAleatorio(num1, num2);
	}
	
	// Metodo para generar el metodo aleatorio
	private int numeroAleatorio(int inferior, int superior) {
		return (int) (Math.random() * (superior - inferior)) + inferior;
		
	}
}
