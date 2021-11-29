package vehiculos;

import java.util.ArrayList;

import java.util.List;

public class Fabricante {
	private static List<Fabricante> fabricantes = new ArrayList<Fabricante> ();
	int ventas = 0;
	private String nombre;
	Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}
	
	public static Fabricante fabricaMayorVentas() {
		int c = 0;
		Fabricante f = null;
		for(int i = 0; i < fabricantes.size(); i++) {
			if(fabricantes.get(i).ventas > c) {
				c = fabricantes.get(i).ventas;
				f = fabricantes.get(i);
			}
		}
		
		return f;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Pais getPais() {
		return pais;
	}
	
}