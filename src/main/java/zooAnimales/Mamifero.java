package zooAnimales;
import gestion.*;
public class Mamifero extends Animal {
	private static Mamifero[] listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public static int cantidadMamiferos() {
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
	Mamifero(String i,int j, String g) {
		nombre=i;
		edad=j;
		genero=g;
	}
	public Mamifero() {
	}
	public Mamifero(String string, int i, String string2, String string3, boolean b, int j) {
		nombre=string;
		edad=i;
		habitat=string2;
		genero=string3;
		pelaje=b;
		patas=j;
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
