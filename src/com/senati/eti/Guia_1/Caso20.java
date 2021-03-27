package com.senati.eti.Guia_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner venta = new Scanner(System.in);
		DecimalFormat redondeo = new DecimalFormat("#.00");
		
		System.out.println("Ingrese el precio de la venta: ");
		float precio = venta.nextFloat();
		
		float incremento = precio * 0.42f;
		
		System.out.println("======RESUSLTADOS======");
		System.out.println("Precio de la venta.....: " + precio);
		System.out.println("El precio de la venta incrementada en 42% es  " + redondeo.format(precio + incremento));

	}

}
