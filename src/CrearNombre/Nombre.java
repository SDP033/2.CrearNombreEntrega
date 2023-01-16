package CrearNombre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nombre {

	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(in);

		String nombre = br.readLine();

		if (nombre.length() < 1) {
			System.exit(-1);
		} else {
			System.out.println("Mi nombre es: " + nombre);
			System.exit(0);
		}

	}

}
