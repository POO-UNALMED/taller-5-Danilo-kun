package zooAnimales;

import gestion.Zona;
import java.util.*;
public class Anfibio extends Animal {
	private static List<Anfibio> listado=new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int cantidadAnfibio() {
		return listado.size();
	}
	public Anfibio(String i,int j, String g) {
		nombre=i;
		edad=j;
		genero=g;
		listado.add(this);
	}
	public Anfibio() {
		listado.add(this);
	}
	public Anfibio(String string, int i, String string2, String string3, String string4, boolean b) {
		nombre=string;
		edad=i;
		habitat=string2;
		genero=string3;
		colorPiel=string4;
		venenoso=b;
		listado.add(this);
	}
	public String movimiento() {
		return "saltar";
	}
	public static Animal crearRana(String i,int j, String g) {
		ranas+=1;
		Anfibio a=new Anfibio(i,j,g);
		a.colorPiel="rojo";
		a.venenoso=true;
		a.habitat="selva";
		return a;
	}
	public static Animal crearSalamandra(String i,int j, String g) {
		salamandras+=1;
		Anfibio a=new Anfibio(i,j,g);
		a.colorPiel="negro y amarillo";
		a.venenoso=false;
		a.habitat="selva";
		return a;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
}
