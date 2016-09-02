/**
 * 
 */
package ejercicio001.animales;

/**
 * @author David
 * @version 1.0
 * 
 * La clase perro emula un perro de la vida real
 */
public class Perro extends Animal{
	//Atributos
	private String nombre;
	private String agresividad;

	//Metodos
	//Contructor Lleno
	public Perro(String nom, String agre) {
		this.nombre = nom;
		this.agresividad = agre;
	}

	//Contructor con 1 Parametro
	public Perro(String agresividad) {
		this.agresividad = agresividad;
	}
	
	//Contructor Vacio
	public Perro() {
	}


	
	

	public String getAgresividad() {
		return agresividad;
	}

	public void setAgresividad(String agresividad) {
		this.agresividad = agresividad;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", agresividad=" + agresividad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String ladrar(){
		String ladrido = " ";
		if(this.agresividad.equals("fiero")){
			ladrido = "GRRR";
		}
		if(this.agresividad.equals("manso")){
			ladrido = "GUAU";
		}
		return ladrido;
	}

	
	
}
