package ejercicio1;

public class Contador {

	public static void main(String[] args) {
		
		int limite;
		System.out.println("Introduzca un limite");
		limite = leer.datoInt();
		
		for(int i = 1; i<limite; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				
			}
		}
		
	}

}
