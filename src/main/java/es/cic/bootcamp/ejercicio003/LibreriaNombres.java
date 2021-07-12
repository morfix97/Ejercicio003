package es.cic.bootcamp.ejercicio003;

public class LibreriaNombres {
	public static String nombresClase[] = { "AF", "PM", "AC", "JB", "PG", "RP" };
	public int m;

	public String NombreAleatorio() {
		m = (int) (Math.random() * 6);
		return nombresClase[m];
	}

	public int posicionNombreAleatorio() {
		return m;
	}

	public String TresNombresAleatorios() {
		int i = (int) (Math.random() * 6);
		int j = i;
		while (j == i) {
			j = (int) (Math.random() * 6);
		}
		int k = i;
		while (k == i || k == j) {
			k = (int) (Math.random() * 6);
		}
		return nombresClase[i] + nombresClase[j] + nombresClase[k];
	}
}
