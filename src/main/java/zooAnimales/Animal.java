package zooAnimales;
import gestion.*;
public class Animal {
	static int totalAnimales;
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	protected Zona[] zona;
	public Animal(String string, int i, String string2, String string3) {
		nombre=string;
		edad=i;
		habitat=string2;
		genero=string3;
	}
	public Animal() {
	}
	public String movimiento() {
		return "desplazarse";
	}
	public static String totalPorTipo() {
		return"Mamiferos: "+Mamifero.cantidadMamiferos()+"\nAves: "+Ave.cantidadAves()+"\nReptiles: "+Reptil.cantidadReptiles()+"\nPeces: "+Pez.cantidadPeces()+"\nAfibios: "+Anfibio.cantidadAnfibio();
	}
	public String toString(){
		if(zona!=null) {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero+", la zona en la que me ubico es "+this.zona+", en el "+Zoologico.getNombre();
		}
		else {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;
		}
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getGenero() {
		return genero;
	}
public static void main(String[] args) {
	new Anfibio();
	new Anfibio();
	new Mamifero();
	new Mamifero();
	new Mamifero();
	new Reptil();
	new Pez();
	new Ave();
	new Ave();
	boolean ok = false;
	String  comp = "Mamiferos: 4\n" + 
			"Aves: 4\n" + 
			"Reptiles: 2\n" + 
			"Peces: 2\n" + 
			"Anfibios: 3";
	if(Animal.totalPorTipo().equals(comp)) {
		ok = true;
	}
	System.out.println(Animal.totalPorTipo());
}
}