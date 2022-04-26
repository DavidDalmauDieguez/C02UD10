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
			System.out.println("1-Suma 2-Resta 3-Multiplicaci�n 4-Potencia 5-Ra�z cuadrada 6-Ra�z c�bica 7-Divisi�n");
			try {				
				eleccionMenu = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Opci�n no v�lida\n");
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
		case 3://Multiplicaci�n
			num1 = numeroOpericion();
			num2 = numeroOpericion();

			System.out.println("El resultado de la multiplicacion es: "+Calculadora.multiplicar(num1, num2));
			break;
		case 4://Potencia
			num1 = numeroOpericion();
			num2 = numeroOpericion();

			System.out.println("El resultado de la potencia es: "+Calculadora.potencia(num1, num2));
			break;
		case 5://Ra�z cuadrada
			num1 	= numeroOpericion();

			try {
				if(num1<0) {
					throw new numeroNegativo();
				}

			}catch(numeroNegativo e) {
				System.out.println(e);
				break;
			}

			System.out.println("El resultado de la ra�z cuadrada es: "
					+Calculadora.raizCuadrada(num1));
			break;
		case 6://Ra�z Cubica
			num1 	= numeroOpericion();
			try {
				if(num1<0) {
					throw new numeroNegativo();
				}

			}catch(numeroNegativo e) {
				System.out.println(e);
				break;
			}

			System.out.println("El resultado de la ra�z c�bica es: "+Calculadora.raizCuadrada(num1));
			break;
		case 7://Divisi�n
			num1 	= numeroOpericion();
			num2 	= numeroOpericion();

			System.out.println("El resultado de la Divisi�n es: "+Calculadora.dividir(num1, num2));
			break;
		}
	}
	
	// Funcion para pedir los numeros
	private static Double numeroOpericion() {
		boolean flag=false;
		Double retorno = 0.0;
		do {
			try {
				System.out.println("Introduce un n�mero");
				retorno = sc.nextDouble();
				flag = true;
			}catch(InputMismatchException e) {
				System.out.println(e);
				System.out.println("Formato de n�mero no correcto, recuerda que los doubles usan \",\"");
				sc.nextLine();
			}
		}while(!flag);

		return retorno;
	}


}