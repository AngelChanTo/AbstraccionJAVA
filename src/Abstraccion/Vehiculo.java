package Abstraccion;

public abstract class  Vehiculo {
	//atributos
	public String marca;
	public int anio;
	//metodo concreto
	
	public void mostrarInfo(){
		System.out.println("Mi auto es: " + marca + " y es del anio: " + anio);
		
	}//cierre mostrar info
	
	//metodo abstracto
	public abstract void acelerar();
	
	//metodo abstracto
	public abstract void frenar();
	
}


/*

Abstraccion

En Java, una clase abstracta es una clase que no puede ser implementada directamente (que no puede instanciar), si no que se utiliza como una base para crear subclases mas concretas. Se utiliza para definir una estructura comun y compartir el comportamiento entre las subclases relacionadas.


*/