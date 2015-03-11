package com.zubiri.multiteca;

public class Disco extends Obra{
	
	private String discografia;
	private int nCanciones;
	
	public Disco(String titulo, Artista autor, int añoEdicion, String discografia, int nCanciones) {
		
	}
	
	public String getDiscografia() {
		
		return discografia;
	}
	
	public void setDiscografia(String discografia) {
		
		this.discografia = discografia;
	}
	
	public int getNCanciones() {
		
		return nCanciones;
	}
	
	public void setNCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}
	
	@Override
	public String formattedObra() {
		String showDisco =
				super.formattedObra()
				+"\tLa discografica es: " + this.discografia + "\n"
				+"\tEl número de canciones es: "+ this.nCanciones + "\n";

				return showDisco;
	}
}
