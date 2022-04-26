package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

import Ejercicio1.NumeroAleatorio;

public class MainApp {

	public static Double num1 	=0.0;
	public static Double num2	=0.0;
	public static int eleccionMenu 	= 0;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		menu();

	}

	//Funcion para el menu
	private static void menu() {
		do {
			// Pedimos la opcion
			System.out.println("Tipo de operacion");
			System.out.println("1-Suma 2-Resta 3-Multiplicación 4-Potencia 5-Raíz cuadrada 6-Raíz cúbica 7-División");
			try {				
				eleccionMenu = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Opción no válida\n");
				//Vaciamos el scanner
				sc.nextLine();
			}
		}while(eleccionMenu > 8||eleccionMenu < 1);
		//Getting the correct option
		switch(eleccionMenu){
		case 1://Suma
			num1 = numeroOpericion();
			num2 = numeroOpericion();

			System.out.println("El resultado de la suma es: " + Calculadora.sumar(num1, num2));
			break;
		case 2://Resta
			num1 = numeroOpericion();
			num2 = numeroOpericion();

			System.out.println("El resultado de la resta es: "+Calculadora.restar(num1, num2));
			break;
		case 3://Multiplicación
			num1 = numeroOpericion();
			num2 = numeroOpericion();

			System.out.println("El resultado de la multiplicacion es: "+Calculadora.multiplicar(num1, num2));
			break;
		case 4://Potencia
			num1 = numeroOpericion();
			num2 = numeroOpericion();

			System.out.println("El resultado de la potencia es: "+Calculadora.potencia(num1, num2));
			break;
		case 5://Raíz cuadrada
			num1 	= numeroOpericion();

			try {
				if(num1<0) {
					throw new numeroNegativo();
				}

			}catch(numeroNegativo e) {
				System.out.println(e);
				break;
			}

			System.out.println("El resultado de la raíz cuadrada es: "
					+Calculadora.raizCuadrada(num1));
			break;
		case 6://Raíz Cubica
			num1 	= numeroOpericion();
			try {
				if(num1<0) {
					throw new numeroNegativo();
				}

			}catch(numeroNegativo e) {
				System.out.println(e);
				break;
			}

			System.out.println("El resultado de la raíz cúbica es: "+Calculadora.raizCuadrada(num1));
			break;
		case 7://División
			num1 	= numeroOpericion();
			num2 	= numeroOpericion();

			System.out.println("El resultado de la División es: "+Calculadora.dividir(num1, num2));
			break;
		}
	}
	
	// Funcion para pedir los numeros
	private static Double numeroOpericion() {
		boolean flag=false;
		Double retorno = 0.0;
		do {
			try {
				System.out.println("Introduce un número");
				retorno = sc.nextDouble();
				flag = true;
			}catch(InputMismatchException e) {
				System.out.println(e);
				System.out.println("Formato de número no correcto, recuerda que los doubles usan \",\"");
				sc.nextLine();
			}
		}while(!flag);

		return retorno;
	}


}