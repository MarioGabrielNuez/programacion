import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.*;

class Tester {
	/*
	 * @Test - Realiza una prueba.
	 * @Disabled - Detiene la ejecución de los test.
	 * @displayName -> Nombra la prueba
	 * @beforeEach - ejecuta antes de cada prueba
	 * @AfterEach . ejecuta despues de cada prueba
	 * @beforeAll - Ejecuta antes de todas las pruebas
	 * @AfterAll - ejecuta despues de todas las pruebas
	 */
	
	public static ArrayList<Cuenta> Cuenta;
	public static ArrayList<Asignacion> Asignacion;
	public static ArrayList<Persona> Personas;
	public static ArrayList<Transferencia> Transferencias;
	
	@BeforeAll
	static void rllnrArrayList() {
		Personas = Back.selectPe();
		Asignacion = Back.selectAs();
		Transferencias = Back.selectTr();
		Cuenta = Back.selectCu();
	}
	
	@AfterAll
	static void vcArrayList() {
		Personas.clear();
		Cuenta.clear();
		Asignacion.clear();
		Transferencias.clear();
	}
	
	@Test
	@DisplayName(value = "Datos de personas")
	static void test() {
		assertNotNull(Personas);
	}
	
	

}
