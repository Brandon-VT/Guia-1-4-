package com.senati.eti.Guia_5;

import com.senati.eti.Guia_5.Modulo_Caso04;

public class Caso04 {

	public static void main(String[] args) {
		Modulo_Caso04 [] Listado=new Modulo_Caso04[5];
		
		Listado[0]=new Modulo_Caso04("Los Perros Hambrientos","Ciro Alegria",
				"1");
		Listado[1]=new Modulo_Caso04("Tradiciones Peruanas","Ricardo Palma",
				"1");
		Listado[2]=new Modulo_Caso04("Informatica Global","Bill Gates",
				"2");
		Listado[3]=new Modulo_Caso04("Los Heraldos Negros","Cesar Vallejo",
				"1");
		Listado[4]=new Modulo_Caso04("Rev. Dig. Merca2.0","Mark Zuckerberg",
				"2");
		System.out.println("LISTA DE PUBLICACIONES");
		System.out.println("=========================");
		System.out.println("N.\tTitulo\t\t\tAutor\t\tTipo");
		System.out.println("==\t======\t\t\t=====\t\t=====");
		int a=1;
		for(Modulo_Caso04 e: Listado) {	
			System.out.println(a+"\t"+e.getTitulo()+"\t"+
			e.getAutor()+"\t"+e.getTipo());
			a++;
		}
	}

}
