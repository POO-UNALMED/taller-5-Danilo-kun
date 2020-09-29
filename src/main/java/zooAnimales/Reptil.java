package zooAnimales;

import gestion.Zona;
import java.util.*;
public class Reptil extends Animal {
	private static List<Reptil> listado=new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public static int cantidadReptiles() {
		return listado.size();
	} 
	Reptil(String i,int j, String g) {
		nombre=i;
		edad=j;
		genero=g;
		listado.add(this);
	}
	public Reptil() {
		listado.add(this);
	}
	public Reptil(String string, int i, String string2, String string3, String string4, int j) {
		nombre=string;
		edad=i;
		habitat=string2;
		genero=string3;
		colorEscamas=string4;
		largoCola=j;
		listado.add(this);
	}
	public String movimiento() {
		return "reptar";
	}
	public static Animal crearIguana(String i,int j,String g) {
		iguanas+=1;
		Reptil a=new Reptil(i,j,g);
		a.colorEscamas="verde";
		a.largoCola=3;
		a.habitat="humedal";
		return a;
	}
	public static Animal crearSerpiente(String i,int j,String g) {
		serpientes+=1;
		Reptil a=new Reptil(i,j,g);
		a.colorEscamas="blanco";
		a.largoCola=1;
		a.habitat="jungla";
		return a;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
}
