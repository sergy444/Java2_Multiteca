import java.util.Scanner;
package com.zubiri.multiteca;

public class Artista {

	private String nombre;
	private int añoNacimiento;

	
	public Artista (){}
	
	public Artista(String nombre, int añoNacimiento) {
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
	}
	
	public Artista(Scanner sc){
		System.out.println("Introduce el nombre del artista: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el año de nacimiento: ");
		setAñoNacimiento(sc.nextInt());
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getAñoNacimiento() {
		
		return añoNacimiento;
	}

	public void setAñoNacimiento(int añoNacimiento) {
		
		this.añoNacimiento = añoNacimiento;
	}
	
}
