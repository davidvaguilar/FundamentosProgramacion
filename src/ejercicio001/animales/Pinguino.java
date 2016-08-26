/**
 * 
 */
package ejercicio001.animales;

/**
 * @author David
 *
 */
public class Pinguino extends Animal{
	
	private String nombre;

	
	
	/**
	 * @param nombre
	 */
	public Pinguino(String nombre) {
		super();
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Pinguino [nombre=" + nombre + "]";
	}

	
	
}
