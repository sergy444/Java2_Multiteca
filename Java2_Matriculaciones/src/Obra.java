import java.util.Scanner;
package com.zubiri.multiteca;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int añoEdicion;
	
	
	public Obra(){}
	
	public Obra(String titulo, Artista autor, int añoEdicion) {
		this.titulo = titulo;
		this.autor = autor;
		this.añoEdicion = añoEdicion;
	}
	
	
	public Obra(Scanner sc) {
		System.out.println("Ingrese el título de la obra: ");
		this.setTitulo(sc.next());
		System.out.println("Ingrese el año de edición: ");
		this.setAñoEdicion(sc.nextInt());
		this.setAutor(new Artista(sc));
		
		
	}
	

	public Artista getAutor() {
		
		return autor;
	}

	public void setAutor(Artista autor) {
		
		this.autor = autor;
	}

	public int getAñoEdicion() {
		
		return añoEdicion;
	}

	public void setAñoEdicion(int añoEdicion) {
		
		this.añoEdicion = añoEdicion;
	}

	public String getTitulo() {
		
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String formattedObra() {
		String showObra =
				"Datos de la obra: \n"
				+"\tTítulo de la obra: " + getTitulo() + "\n"
				+"\tEl autor de la obra es: " + getAutor() + "\n"
				+"El año de edición fue: "+ getAñoEdicion() + "\n";
		return showObra;
	}
	
	
		
	}
