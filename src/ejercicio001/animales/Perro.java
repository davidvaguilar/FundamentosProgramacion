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
	
	public String ladrar(){
		String ladrido = "";
		if(this.agresividad == "fiero"){
			ladrido = "Grrr!!!";
		}
		if(this.agresividad == "manso"){
			ladrido = "Guau!";
		}
		return ladrido;
	}
}
