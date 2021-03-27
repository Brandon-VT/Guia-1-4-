package com.senati.eti;

import java.util.Scanner;

public class Caso02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int [5];
		int num_mayor = 0, num_menor = 0, suma = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Ingrese número " + (i+1) + ": " );
			numeros[i] = sc.nextInt();
			
			if(i == 0) {
				num_mayor = numeros[0];
				num_menor = numeros[0];
			}
			if(numeros[i] > num_mayor) num_mayor = numeros[i];
			if(numeros[i] < num_menor) num_menor = numeros[i];
			
			suma += numeros[i];
				
		}
		
		System.out.println(" R E S U L T A D O S ");
		System.out.println("Número mayor: " + num_mayor);
		System.out.println("Número menor: " + num_menor);
		System.out.println("Sumatoria: " + suma);
		
		
		
		
		
		

	}

}
