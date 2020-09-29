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
}
