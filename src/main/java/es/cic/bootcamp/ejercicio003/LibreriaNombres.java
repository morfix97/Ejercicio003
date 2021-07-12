package es.cic.bootcamp.ejercicio003;

public class LibreriaNombres {
	public static String nombresClase[] = { "AF", "PM", "AC", "JB", "PG", "RP" };
	public int m;


	public String NombreAleatorio() {
		m = (int) (Math.random() * 6);
		return nombresClase[m];
	}

	public String[] TresNombresAleatorios() {
		int i = (int) (Math.random() * 6);
		int j = i;
		while (j == i) {
			j = (int) (Math.random() * 6);
		}
		int k = i;
		while (k == i || k == j) {
			k = (int) (Math.random() * 6);
		}
		String tresNombres[] = new String[3];
		tresNombres[0]=nombresClase[i];
		tresNombres[1]=nombresClase[j];
		tresNombres[2]=nombresClase[k];
		return tresNombres;
	}
}
