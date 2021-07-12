package ejercicio003;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.cic.bootcamp.ejercicio003.LibreriaNombres;

class LibreriaNombresTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		LibreriaNombres libreria = new LibreriaNombres();
		String nombre = libreria.NombreAleatorio();
		int m = libreria.posicionNombreAleatorio();
		assertEquals(nombre,LibreriaNombres.nombresClase[m],"Ha habido un error ");
	}

}
