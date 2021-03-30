package com.senati.eti.Guia_5;

public class Modulo_Caso04 {
	public Modulo_Caso04(String obra,String nom,String tipo) {
		autor=nom;
		titulo=obra;
		Tipo=tipo;
	}
	public String getAutor() {//get
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getTipo() {
		if(Tipo.equals("1")) {
			return "Libro";
		}else {
			return "Revista";
		}
	}
	private String autor;
	private String titulo;
	private String Tipo;

}
