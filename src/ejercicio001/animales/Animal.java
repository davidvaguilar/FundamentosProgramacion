/**
 * 
 */
package ejercicio001.animales;

/**
 * @author David
 * @version 1.0
 */
public class Animal {
	//Atributos
	
	
	//Metodos (Procedimiento)
	public void vivir (){
		boolean corazon;
		boolean cerebro;
		boolean pulmones;
		boolean higado;
		
		corazon = true;
		if(corazon){
			System.out.println("El corazon funcionando");
		}else{
			System.out.println("El corazon NO funcionando");
		}
		cerebro = true;
		if(cerebro){
			System.out.println("El cerebro esta funcionando");
		}else{
			System.out.println("El cerebro NO esta funcionando");
		}
		pulmones = true;
		System.out.println("Los pulmones estan funcionando");
		higado = true;
		System.out.println("El higado esta funcionando");
	}

}
