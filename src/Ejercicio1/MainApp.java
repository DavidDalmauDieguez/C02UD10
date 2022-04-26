package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {	
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Cramos las variables
		int num = 0;
		int contador = 0;
		boolean acertado = false;
		
		NumeroAleatorio numAleatorio = new NumeroAleatorio();
		
		// Bucle del cual no salimos hasta que acierte el numero.
		do {
			try {
				// Pedimos el valor
				System.out.println("Introduce el numero para intentar adivinarlo: ");
				num = sc.nextInt();

				// Si el valor es igual al numero
				if (num == numAleatorio.getNumeroAleatorio()) {
					acertado = true;
					
					// Si el valor es mayor
				} else if (num > numAleatorio.getNumeroAleatorio()) {
					System.out.println("El numero es demasiado grande");
					
					// Si el valor es menor al numero
				} else {
					System.out.println("El numero a adivinar es demasiado pequeño");
					
				}
				contador++;

			} catch (InputMismatchException e) {
				System.out.println("El texto no es valido");
				sc.nextInt();
				contador++;
				
			}
		} while (!acertado);

		System.out.println("El numero era el " + numAleatorio.getNumeroAleatorio());
		System.out.println("Numero de intentos: " + contador + " veces.");		

	}

}