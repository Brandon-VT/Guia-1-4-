package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] numeros = new Integer[5];
		
		System.out.println("LECTURA DE NÚMEROS");
		System.out.println("==================");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Ingrese número " + (i+1) + ": " );
			numeros[i] = sc.nextInt();
				
		}
		
		// Ordenar de forma ascendente
		Arrays.sort(numeros);
		System.out.println("\nNÚMEROS ORDENADOS DE FORMA ASCENDETE");
		System.out.println("====================================");
		for(int i = 0; i < numeros.length; i++) 
			System.out.println("Número " + (i+1) + ": " + numeros[i] );
		
		// Ordenar de forma descendente
		Arrays.sort(numeros, Collections.reverseOrder());
		System.out.println("\nNÚMEROS ORDENADOS DE FORMA DESCENDETE");
		System.out.println("=====================================");
		for(int i = 0; i < numeros.length; i++) 
			System.out.println("Número " + (i+1) + ": " + numeros[i] );

	}

}
