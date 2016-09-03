/**
 * 
 */
package ejercicio001.animales;

import java.util.Scanner;

/**
 * @author David
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Perro p1;
		Perro p2;
		p1 = new Perro("fiero");
		p2 =new Perro();
		
		p1.setNombre("firulais");
		p2.setAgresividad("manso");
		System.out.println(p1.getAgresividad());
		System.out.println(p2.getAgresividad());
		System.out.println(p2.toString());
		
		
	}

}
