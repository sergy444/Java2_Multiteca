package com.zubiri.multiteca;

public class Libro extends Obra{
	
	private String editorial;
	private int numPaginas;
	
	public Libro(String titulo, Artista autor, int añoEdicion, String editorial, int numPaginas) {
		super();
	}
	
	public String getEditorial() {
		
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
	}
	
	public int getNumPaginas() {
		
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		
		this.numPaginas = numPaginas;
	}
	@Override
	public String formattedObra() {
		String showLibro =
		super.formattedObra()
		+"\tLa editorial es: " + this.editorial + "\n"
		+"\tEl número de páginas es: "+ this.numPaginas + "\n";

		return showLibro;
	}
	
	
	
	

}
