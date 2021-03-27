package com.senati.eti;

public class Caso06 {

	public static void main(String[] args) {
		String [][] datos = {{"Brandon", "Elioth", "Luis"},
				             {"Comas", "SMP", "Ate"}};
		
		// datos.length -> Cantidad de filas de la matriz...(2)
		// datos[0].length -> Cantidad de elementos del arreglo de la 1era. fila...(3)
		
		// Impresion de valores de la matriz por filas
		System.out.println("IMPRESIÓN POR FILAS");
		for(int f = 0; f < datos.length; f++) {
			for(int c = 0; c < datos[0].length; c++) 
				System.out.print(String.format("%-10s", datos[f][c] + "\t"));
			
			System.out.println();
		
		}
		
		// Impresion de valores de la matriz por columnas
		System.out.println("IMPRESIÓN POR COLUMNAS");
		for(int c = 0; c < datos[0].length; c++) {
			for(int f = 0; f < datos.length; f++) 
				System.out.print(String.format("%-10s", datos[f][c] + "\t"));
			
			System.out.println();
		
		}

	}

}
