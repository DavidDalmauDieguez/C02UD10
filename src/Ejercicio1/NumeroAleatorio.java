package Ejercicio1;

public class NumeroAleatorio {
	// Creamos variables estaticas
	private final int INFERIOR = 1;
	private final int SUPERIOR = 500;
	
	// Creamos variables
	private int numAleatorio;

	// Creamos constructor
	public NumeroAleatorio() {
		this.numAleatorio = numeroAleatorio(INFERIOR, SUPERIOR);
	}
	
	// Creamos funcion para el numero aleatorio
	private int numeroAleatorio(int inferior, int superior) {
		return (int)(Math.random() * (superior - inferior)) + inferior;
	}

	public int getNumeroAleatorio() {
		return numAleatorio;
	}
}
