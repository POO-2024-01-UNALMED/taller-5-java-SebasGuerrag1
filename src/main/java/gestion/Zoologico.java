package gestion;

import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas= new ArrayList<Zona>();
	
	
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	
	public void agregarZonas(Zona nuevaZona) {
		zonas.add(nuevaZona);
	}
	
	public int cantidadTotalAnimales(){ 
		int animalitos=0;
		for(int i=0; i<zonas.size(); i++ ) {
			animalitos += zonas.get(i).cantidadAnimales();
		}
		return animalitos;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas=zonas;
	}
}