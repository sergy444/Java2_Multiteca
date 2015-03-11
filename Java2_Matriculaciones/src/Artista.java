import java.util.Scanner;
package com.zubiri.multiteca;

public class Artista {

	private String nombre;
	private int a�oNacimiento;

	
	public Artista (){}
	
	public Artista(String nombre, int a�oNacimiento) {
		this.nombre = nombre;
		this.a�oNacimiento = a�oNacimiento;
	}
	
	public Artista(Scanner sc){
		System.out.println("Introduce el nombre del artista: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el a�o de nacimiento: ");
		setA�oNacimiento(sc.nextInt());
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getA�oNacimiento() {
		
		return a�oNacimiento;
	}

	public void setA�oNacimiento(int a�oNacimiento) {
		
		this.a�oNacimiento = a�oNacimiento;
	}
	
}
