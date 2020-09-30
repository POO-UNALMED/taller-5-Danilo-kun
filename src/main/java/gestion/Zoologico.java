package gestion;
import java.util.*;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static List<Zona> zonas=new ArrayList<>();
	public Zoologico(){
		
	}
	public Zoologico(String i,String j){
		nombre=i;
		ubicacion=j;
	}
	public void agregarZonas(Zona i) {
		zonas.add(i);
	}
	public static int cantidadTotalAnimales() {
		int aux=0;
		for(int i=0;i<zonas.size();i++) {
			aux+=zonas.get(i).cantidadAnimales();
		}
		return aux;
	}
	public String getNombre() {
		return nombre;
	}
	public List<Zona> getZona() {
		return zonas;
	}
}
