package Ejercicio5;

public class Contrasena {
	//Valores de la contraseña
	public static String NUMEROS = "0123456789";
	public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
	//Valores possibles de la contraseña
	public static String VALORES = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public int longitud = 8;
	public String contrasenya = "";

	//Constructores
	public Contrasena() {

	}

	public Contrasena(int longitud) {
		this.longitud = longitud;
		contrasenya = generarPassword(longitud);
	}

	// Funcion para mayusculas o minusculas
	public static boolean esFuerte(String contrasenya) {
		boolean duracion 	= false;
		int mayusculas 	= 0;
		int minusculas 	= 0;
		int numeros		= 0;

		for(int i=0; i<contrasenya.length();i++) {
			char caracter = contrasenya.charAt(i);
			for(int x=0;x<NUMEROS.length();x++) {
				if(NUMEROS.charAt(x)==caracter) {
					numeros++;
				}
			}
			for(int y=0;y<MAYUSCULAS.length();y++) {
				if(MAYUSCULAS.charAt(y)==caracter) {
					mayusculas++;
				}
			}
			for(int z=0;z<MAYUSCULAS.length();z++) {
				if(MINUSCULAS.charAt(z)==caracter) {
					minusculas++;
				}
			}
		}
		//Check the integrity of the password
		if(mayusculas>2&&minusculas>1&&numeros>5) {
			duracion = true;
		}
		return duracion;
	}
	//Funcion para crear la contraseña
	public static String generarPassword(int longitud) {
		String contrasenyaG = "";

		for (int i = 0; i < longitud; i++) {
			contrasenyaG+=(VALORES.charAt((int)(Math.random() * VALORES.length())));
		}

		return contrasenyaG;		
	}

	//Getters and Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

}
