package Ejercicio4;

public class Calculadora {	
	
	public double num1 = 0.0;
	public double num2 = 0.0;
	
	
	// Funciones para sumar, restar, multiplicar y dividir, etc.
		public static double sumar(double num1, double num2) {
			return (num1+num2);
		}
		
		public static double restar(double num1, double num2) {
			return (num1-num2);
		}
		
		public static double multiplicar(double num1, double num2){
			return (num1*num2);
		}
		
		public static double dividir(double num1, double num2){
			return (num1/num2);
		}
		
		public static double potencia(double num1, double num2){
			return (Math.pow(num1, num2));
		}
		
		public static double raizCuadrada(double num1){
			return (Math.sqrt(num1));
		}
		
		public static double raizCubica(double num1){
			return (Math.cbrt(num1));
			
		}	
	
}
