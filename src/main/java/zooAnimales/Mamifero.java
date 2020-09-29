package zooAnimales;
import gestion.*;
import java.util.*;
public class Mamifero extends Animal {
	private static List<Mamifero> listado=new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public static int cantidadMamiferos() {
		return listado.size();
	}
	Mamifero(String i,int j, String g) {
		nombre=i;
		edad=j;
		genero=g;
		listado.add(this);
	}
	public Mamifero() {
		listado.add(this);
	}
	public Mamifero(String string, int i, String string2, String string3, boolean b, int j) {
		nombre=string;
		edad=i;
		habitat=string2;
		genero=string3;
		pelaje=b;
		patas=j;
		listado.add(this);
	}
	public static Animal crearCaballo(String i,int j,String g) {
		caballos+=1;
		Mamifero a=new Mamifero(i,j,g);
		a.pelaje=true;
		a.patas=4;
		a.habitat="pradera";
		return a;
	}
	public static Animal crearLeon(String i,int j,String g) {
		leones+=1;
		Mamifero a=new Mamifero(i,j,g);
		a.pelaje=true;
		a.patas=4;
		a.habitat="selva";
		return a;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public int getPatas() {
		return patas;
	}
}
