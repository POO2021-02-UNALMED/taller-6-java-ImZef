package vehiculos;

import java.util.ArrayList;

public class Pais {
	private static ArrayList<Pais> paises;
	int ventas = 0;
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public static Pais paisMasVendedor() {
		int c = 0;
		Pais p = null;
		
		for(int i = 0; i < paises.size(); i++) {
			if (paises.get(i).ventas > c) {
				c = paises.get(i).ventas;
				p = paises.get(i);
			}
		}
		
		return p;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}