package com.zubiri.multiteca;

import java.util.ArrayList;

public final class Multiteca {
	
	private static ArrayList<Obra> obras = new ArrayList<Obra>();
	private static int numObras = 0;

	public Multiteca() {}

	public Multiteca(ArrayList<Obra> obras) {
		this.obras=obras;
	}
	
	public void setMultiteca(ArrayList<Obra> obras) {
		
		this.obras = obras;
	}
	
	public ArrayList<Obra> getMultiteca() {
		return this.obras;
	}
	
	public void addObra(Obra obra) {
		
		obras.add(Obra);
	}
	
	public Obra obtainObra(int index) {
		
		for(index = 0; obras.size() > index; index++){
			return Obra;
		}
	}
	
	public static counter() {

	}
	
	public String formattedMultiteca() {
		String showMultiteca =
				
				"\nMultiteca llena";
		for (int f = 0; f < obras.size(); f++) {
			showMultiteca += obras.get(f).formattedObra();
		}
		showMultiteca += 
				"Fin";
				
		return showMultiteca;
	}
	
}
