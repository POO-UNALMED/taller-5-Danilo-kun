package gestion;
import java.util.*;
public class Zoologico {
	private static String nombre;
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
		if(zonas.size()!=0){
			int aux=0;
			for(int i=0;i<zonas.size();i++) {
				aux+=1;
			}
			return aux;
		}
		else {
			return 0;
		}
	}
	public static String getNombre() {
		return nombre;
	}
	public Object getZona() {
		return zonas;
	}
}
