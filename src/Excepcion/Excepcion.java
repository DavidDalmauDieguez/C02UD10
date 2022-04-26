package Excepcion;

public class Excepcion extends Exception{
	// Creamos variables
	private String mensaje;
	private int numero_random;

	// Creamos constructor
	public Excepcion(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public Excepcion(int numRandom) {
		super();
		this.numero_random = numRandom;
	}

	// Funcion para saber el numero par o impar ej3
	public String getMessage() {

		if (this.numero_random % 2 == 0) {
			return "Es par";
		} else {
			return "Es impar";
		}

	}

	// Generamos el toString
	@Override
	public String toString() {
		return mensaje;
	}

}
