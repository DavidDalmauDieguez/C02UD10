package Ejercicio3;

import Excepcion.Excepcion;

public class MainApp {

	public static void main(String[] args) {
		// Creamos la excepcion
		try {			
			NumeroAleatorio num_random1 = new NumeroAleatorio();
			System.out.println("El numero aleatorio es: " + num_random1.numAleatorio());			
			throw new Excepcion(num_random1.numAleatorio());				

		} catch (Excepcion e) {
			System.out.println(e.getMessage());

		}
	}
}
