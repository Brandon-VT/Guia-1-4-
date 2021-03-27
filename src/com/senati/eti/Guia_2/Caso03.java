package com.senati.eti.Guia_2;

import java.util.*;

public class Caso03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el número 1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Ingrese el número 2: ");
		int n2 = sc.nextInt();
		
		System.out.println("Ingrese el número 3: ");
		int n3 = sc.nextInt();
		
		String estado = "";
		
		if (n1 == n2 && n1 == n3) 
			estado = "Los números son iguales.";
		else if (n1 > n2 && n1 > n3)
			estado = "El primer número " + n1 + " es mayor.";
		else if (n1 < n2 && n2 > n3)
			estado = "El segundo número " + n2 + " es mayor.";
		else
			estado = "El tercer número " + n3 + " es mayor.";
		
		System.out.println("\nR E S U L T A D O");
		System.out.println("Estado: " + estado);
	}

}
