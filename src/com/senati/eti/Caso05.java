package com.senati.eti;

import java.util.Scanner;

public class Caso05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrcodigo = {"A-123", "A-456", "A-789", "A-777"};
		String[] arrnombre = {"Brandon Villa", "Yeral Oropeza", "Aurelio Casillas", "Pablo Escobar"};
		int[] arrnota = {20, 10, 14, 18};
		
		System.out.println("BÚSQUEDA DE DATOS");
		System.out.println("=================");
		System.out.print("Código a buscar: ");
		String codigo = sc.nextLine();
		
		int pos = -1;
		
		for(int i = 0; i < arrcodigo.length; i++) {
			if(codigo.equals(arrcodigo[i])) {
				pos = i;
				break;
			}

		}
		
		if(pos == -1) {
			System.out.println("\n====================");
			System.out.println("CÓDIGO NO ENCONTRADO");
			System.out.println("====================");
			
		}
		else {
			System.out.println("\n=================");
			System.out.println("CÓDIGO ENCONTRADO");
			System.out.println("=================");
			System.out.println("Código: " + arrcodigo[pos]);
			System.out.println("Nombre: " + arrnombre[pos]);
			System.out.println("Nota: " + arrnota[pos]);
		}

	}

}
