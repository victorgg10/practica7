package com.generation;

//se importo hashmap
import java.util.HashMap;
//se importo scanner
import java.util.Scanner;

public class Codigo7 {

	// se agrego el metodo main
	public static void main(String[] args) {

		// se agrego el metodo de entrada
		Scanner s = new Scanner(System.in);

		// se modifico el nombre de la instancia
		// se modifico el tipo de dato del hashmap
		HashMap<String, String> capitales = new HashMap<>();

		capitales.put("Canadá", "Otawwa");
		capitales.put("Estados Unidos", "Washington DC");
		capitales.put("México", "México DF");
		capitales.put("Belice", "Belmopán");
		capitales.put("Costa rica", "San José");
		// se agrego un valor a la key de salvador
		capitales.put("El Salvador", "San Salvador");
		capitales.put("Guatemala", "Ciudad de Guatemala");
		capitales.put("Honduras", "Tegucigalpa");
		capitales.put("Nicaragua", "Managua");
		capitales.put("Panamá", "Panamá");

		// se modifico el nombre de la clase estaba mal escrito
		String c = "";

		do {
			// se modifico el metodo de salida
			System.out.print("Escribe el nombre de un país y te diré su capital: ");
			// se modifico el metodo de entrada a String
			c = s.nextLine();

			// se agrego la s al metodo equal
			if (!c.equals("salir")) {
				// se modifico el nombre del objeto ca a capitales
				// se cambio la condicion de containsvalue a containskey ya que esta resiviendo
				// un string para comparar
				if (capitales.containsKey(c)) {
					// se modifico el nomnre del metodo de salida
					System.out.print("La capital de " + c);
					// se momdifico el nombre del objeto ca a capitales, se cambio put a get para
					// obtener el dato
					System.out.println(" es " + capitales.get(c));
				} else {
					System.out.print("No conozco la respuesta ");
					System.out.print("¿cuál es la capital de " + c + "?: ");
					String ca = s.nextLine();
					// se modifico el nombre del objeto a capitales antes era cat
					capitales.put(c, ca);
					System.out.println("Gracias por enseñarme nuevas capitales");
				}
			}
			// se modifico el nombre de la condicional wile a while, se agrego un ) faltante
		} while (!c.equals("salir"));
		// se agrego una salida de sistema para indicar que el programa termino
		System.out.println("adios");
	}

}

// se elimino una { sobrante
//el programa te pide un pais y te dice la capital en caso de no encontrarlo ete te pide que lo ingreses y lo guarda
