package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	private static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int cantidadAnfibio() {
		if(listado!=null){
			int aux=0;
			for(int i=0;i<listado.length;i++) {
				aux+=1;
			}
			return aux;
		}
		else {
			return 0;
		}
	}
	public Anfibio(String i,int j, String g) {
		nombre=i;
		edad=j;
		genero=g;
	}
	public Anfibio() {
	}
	public Anfibio(String string, int i, String string2, String string3, String string4, boolean b) {
		nombre=string;
		edad=i;
		habitat=string2;
		genero=string3;
		colorPiel=string4;
		venenoso=b;
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
