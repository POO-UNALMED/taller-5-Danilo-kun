package zooAnimales;

import gestion.Zona;
import java.util.*;
public class Ave extends Animal {
	private static List<Ave> listado=new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public static int cantidadAves() {
		return listado.size();
	}
	Ave(String i,int j, String g) {
		nombre=i;
		edad=j;
		genero=g;
		listado.add(this);
	}
	public Ave() {
		listado.add(this);
	}
	public Ave(String string, int i, String string2, String string3, String string4) {
		nombre=string;
		edad=i;
		habitat=string2;
		genero=string3;
		colorPlumas=string4;
		listado.add(this);
	}
	public String movimiento() {
		return "volar";
	}
	public static Animal crearHalcon(String i,int j,String g) {
		halcones+=1;
		Ave a=new Ave(i,j,g);
		a.habitat="montañas";
		a.colorPlumas="cafe glorioso";
		return a;
	}
	public static Animal crearAguila(String i,int j,String g) {
		aguilas+=1;
		Ave a=new Ave(i,j,g);
		a.habitat="montañas";
		a.colorPlumas="blanco y amarillo";
		return a;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
}
