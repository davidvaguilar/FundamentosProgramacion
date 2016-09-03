package ejercicio003.usuario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String nombre, apellido, direccion, login;
		int password;
		Usuario usu1;
		usu1=new Usuario(1);
		System.out.println("Ingrese su nombre");
		nombre=input.next();
		System.out.println("Ingrese su apellido");
		apellido=input.next();
		System.out.println("Ingrese su direccion");
		direccion=input.next();
		System.out.println("Ingrese un login");
		login=input.next();
		System.out.println("Ingrese un password");
		password=input.nextInt();
		
		usu1.setNombre(nombre);
		usu1.setApellido(apellido);
		usu1.setDireccion(direccion);
		usu1.setUsuario(login);
		usu1.setPassword(password);
		
		System.out.println(usu1.toString());
		

	}

}
