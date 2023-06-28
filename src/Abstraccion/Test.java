package Abstraccion;

public class Test {
	
	public static void main(String[] args) {
		Motocicleta myMoto =  new Motocicleta();
		
		Automovil myTroquita =  new Automovil();
		
		myMoto.acelerar();
		myMoto.frenar();
		System.out.println("----------------");
		myTroquita.acelerar();
		myTroquita.frenar();
	}
}


