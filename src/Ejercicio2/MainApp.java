package Ejercicio2;

import Excepcion.Excepcion;

public class MainApp{

	public static void main(String[] args) {
		// Creamos el mensaje
		String mensaje = "Excpeción capturada con mensaje: Esto es un objeto Exception";

		// Creamos la excepcion
		try {
			{
				throw new Excepcion(mensaje);
			}
		} catch (Excepcion excepcion) {
			System.out.println(excepcion);;
		}	

	}
}