package com.senati.eti.Guia_2;

import java.util.Scanner;

public class Caso04_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese n�mero 1......: ");
		int n1 = sc.nextInt();

		System.out.print("Ingrese n�mero 2......: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 3......: ");
		int n3 = sc.nextInt();

		
		String estado = "";
		if (n1==n2 && n1==n3  )
			estado = "Los numeros son iguales";
		else if (n1< n2 && n1 < n3 )
			estado = "El primer n�mero " + n1 + " es menor";
		else if (n2< n1 && n2 < n3)
			estado = "El segundo n�mero " + n2 + " es menor";
		else
			estado = "El tercer n�mero " + n3 + " es menor. ";

		System.out.println("Estado: "+ estado);

	}

}
