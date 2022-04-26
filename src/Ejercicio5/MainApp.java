package Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	// Creamos las variables
	public static Scanner sc = new Scanner(System.in);
	public static int tamanyoArray = 0;
	public static int longitudP = 0;
	public static Contrasena [] arrayPasswords;
	public static boolean [] calidadPasswords;

	public static void main(String[] args) {		
		//Pedimos los tamaños
		tamanyoArray = pedirInt("Introduce numero de contraseñas");
		
		//Arrays con el tamaño pedido por teclado
		arrayPasswords = new Contrasena[tamanyoArray];
		calidadPasswords = new boolean [tamanyoArray];
		
		longitudP = pedirInt("Introduce que longitud que quieres que tengan los passwords");
		
		for(int i=0; i<tamanyoArray;i++) {
			arrayPasswords[i] 	= new Contrasena(longitudP);
			calidadPasswords[i] = Contrasena.esFuerte(arrayPasswords[i].contrasenya);
			System.out.println(arrayPasswords[i].contrasenya+" "+calidadPasswords[i]);
		}

	}
//Methods

	//Request of int input
	private static int pedirInt(String frase) {
		boolean duracion=false;
		int longi =0;
		do {
			System.out.println(frase);
			try {
				//Input of the size of the array
				longi = sc.nextInt();
				duracion = true;
			}catch(InputMismatchException e) {
				System.out.println(e);
				//Cleaning the scanner
				sc.nextLine();
			}
		}while(!duracion);
		return longi;
	}

}
