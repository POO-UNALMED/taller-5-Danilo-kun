package gestion;
import java.util.*;
import zooAnimales.*;
public class Zona {
	private String nombre;
	public static Zoologico zoo;
	private List<Animal> animales=new ArrayList<>();
	public Zona(String string, Zoologico zoo1) {
		nombre=string;
		zoo=zoo1;
	}
	public Zona() {
	}
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
	public String getNombre() {
		return nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
}
