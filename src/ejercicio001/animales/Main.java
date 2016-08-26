/**
 * 
 */
package ejercicio001.animales;

/**
 * @author David
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Perro p1= new Perro("Cain", "fiero");
		System.out.println("El primer perro ladra : "+p1.ladrar());
		Perro perro2=new Perro("Abel","manso");
		System.out.println("El segundo perro ladra : "+perro2.ladrar());
		Loro lorito = new Loro();
		System.out.println("Observando al loro"+lorito.hablar());
		Pinguino pingui= new Pinguino("Adela");
		System.out.println(pingui.toString());
		System.out.println(p1.toString());
		System.out.println(perro2.toString());
	}

}
