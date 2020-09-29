package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
	private static Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public static int cantidadPeces() {
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
	Pez(String i,int j, String g) {
		nombre=i;
		edad=j;
		genero=g;
	}
	public Pez() {
	}
	public Pez(String string, int i, String string2, String string3, String string4, int j) {
		nombre=string;
		edad=i;
		habitat=string2;
		genero=string3;
		colorEscamas=string4;
		cantidadAletas=j;
	}
	public String movimiento() {
		return "nadar";
	}
	public static Animal crearSalmon(String i,int j,String g) {
		salmones+=1;
		Pez a=new Pez(i,j,g);
		a.colorEscamas="rojo";
		a.cantidadAletas=6;
		a.habitat="oceano";
		return a;
	}
	public static Animal crearBacalao(String i,int j,String g) {
		bacalaos+=1;
		Pez a=new Pez(i,j,g);
		a.colorEscamas="gris";
		a.cantidadAletas=6;
		a.habitat="oceano";
		return a;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
}
