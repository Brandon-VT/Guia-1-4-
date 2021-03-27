package com.senati.eti;

public class Caso01 {
	public static void main(String[] args) {
		// Declarar el arreglo
		String [] nombre = new String[4];
		
		// Asignar valores al arreglo
		nombre[0] = "Brandon Villa";
		nombre[1] = "Mia Khalifa";
		nombre[2] = "Luis Taype";
		nombre[3] = "Elioth Saldivar";
		
		for(int i  = 0; i < nombre.length; i++) 
			
			System.out.println("Nombre " + (i+1) + ": " + nombre[i]);
		
		
	}

}
