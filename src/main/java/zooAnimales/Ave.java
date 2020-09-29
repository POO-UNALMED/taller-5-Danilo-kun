package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
	private static Ave[] listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public static int cantidadAves() {
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
	Ave(String i,int j, String g) {
		nombre=i;
		edad=j;
		genero=g;
	}
	public Ave() {
	}
	public Ave(String string, int i, String string2, String string3, String string4) {
		nombre=string;
		edad=i;
		habitat=string2;
		genero=string3;
		colorPlumas=string4;
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
