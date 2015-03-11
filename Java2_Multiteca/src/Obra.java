import java.util.Scanner;
package com.zubiri.multiteca;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int a�oEdicion;
	
	
	public Obra(){}
	
	public Obra(String titulo, Artista autor, int a�oEdicion) {
		this.titulo = titulo;
		this.autor = autor;
		this.a�oEdicion = a�oEdicion;
	}
	
	
	public Obra(Scanner sc) {
		System.out.println("Ingrese el t�tulo de la obra: ");
		this.setTitulo(sc.next());
		System.out.println("Ingrese el a�o de edici�n: ");
		this.setA�oEdicion(sc.nextInt());
		this.setAutor(new Artista(sc));
		
		
	}
	

	public Artista getAutor() {
		
		return autor;
	}

	public void setAutor(Artista autor) {
		
		this.autor = autor;
	}

	public int getA�oEdicion() {
		
		return a�oEdicion;
	}

	public void setA�oEdicion(int a�oEdicion) {
		
		this.a�oEdicion = a�oEdicion;
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
				+"\tT�tulo de la obra: " + getTitulo() + "\n"
				+"\tEl autor de la obra es: " + getAutor() + "\n"
				+"El a�o de edici�n fue: "+ getA�oEdicion() + "\n";
		return showObra;
	}
	
	
		
	}
