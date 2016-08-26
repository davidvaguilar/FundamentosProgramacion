/**
 * 
 */
package ejercicio001.animales;

/**
 * @author David
 *
 */
public class Perro extends Animal{
	private String nombre;
	private String agresividad;
	
	
	
	public Perro(String nombre, String agresividad) {
		super();
		this.nombre = nombre;
		this.agresividad = agresividad;
	}



	public String ladrar(){
		String ladrido = " ";
		if(this.agresividad.equals("fiero")){
			ladrido="GRRR";
		}
		if(this.agresividad.equals("manso")){
			ladrido="GUAU";
		}
		return ladrido;
	}



	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", agresividad=" + agresividad + "]";
	}
	
	
	
}
