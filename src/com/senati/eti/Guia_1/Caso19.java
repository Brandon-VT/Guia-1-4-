package com.senati.eti.Guia_1;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner suma = new Scanner(System.in);
		
		System.out.print("Ingrese lado 1........: ");
		int a = suma.nextInt();
		
		System.out.print("Ingrese lado 2........: ");
		int b = suma.nextInt();	
		
		System.out.print("Ingrese lado 3........: ");
		int c = suma.nextInt();
		
		int operacion = a + b + c;
		
		String mensaje = "";
		
		if((a < b + c) && ((a > b - c) || (a > c -b) ))
			mensaje = "Existe";
		else
			mensaje = "No existe";
		
		if ((b < a + c) && ((b > a - c) || (b > c - a) ))
			mensaje = "Existe";
		else
			mensaje = "No existe";
		
		if ((c < a + b) && ((c > a - b) || (c > b - a) ))
			mensaje = "Existe";
		else
			mensaje = "No existe";
		
		if (mensaje == "Existe") {
			System.out.println("==== R E S U L T A D O S ====");
			System.out.println("El triángulo " + mensaje);
			System.out.println("El perímetro del triángulo es " + operacion);
		}
		else if (mensaje == "No existe") {
			System.out.println("==== R E S U L T A D O S ====");
			System.out.println("El triángulo " + mensaje);
			System.out.println("El perímetro del triángulo es " + operacion);
		}

	}

}
