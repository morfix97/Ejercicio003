package es.cic.bootcamp.ejercicio003;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibreriaNombresTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		LibreriaNombres libreria = new LibreriaNombres();
		String nombre = libreria.NombreAleatorio();
		String nombreCorrespondido = LibreriaNombres.nombresClase[libreria.m];
		assertEquals(nombre,nombreCorrespondido,"Ha habido un error ");
	}
	
	@Test
	void test2() {
		LibreriaNombres libreria = new LibreriaNombres();
		String tresNombresAleatoriosPrueba[] = new String[3];
		tresNombresAleatoriosPrueba = libreria.TresNombresAleatorios();
		assertNotEquals(tresNombresAleatoriosPrueba[0],tresNombresAleatoriosPrueba[1],"Ha habido un error ");
		assertNotEquals(tresNombresAleatoriosPrueba[0],tresNombresAleatoriosPrueba[2],"Ha habido un error ");
		assertNotEquals(tresNombresAleatoriosPrueba[1],tresNombresAleatoriosPrueba[2],"Ha habido un error ");
	}


}
