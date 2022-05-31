import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControllerServeurTest {

	@Test
	void testTraiterCaractereRecuperer() {
		ControllerServeur.traiterCaractereRecuperer("a");
		org.junit.jupiter.api.Assertions.assertEquals("a", ControllerServeur.listCaractere.get(0).print());
		ControllerServeur.traiterCaractereRecuperer("b");
		org.junit.jupiter.api.Assertions.assertEquals("b", ControllerServeur.listCaractere.get(1).print());
		ControllerServeur.traiterCaractereRecuperer(" ");
		ControllerServeur.traiterCaractereRecuperer(" ");
		ControllerServeur.traiterCaractereRecuperer("c");
		ControllerServeur.traiterCaractereRecuperer(".");
		org.junit.jupiter.api.Assertions.assertEquals(" ab  c.", ControllerServeur.listPhrase.get(0).print());
	}
	@Test
	void testTraiterFin() {		
		org.junit.jupiter.api.Assertions.assertEquals("ab  c.", ControllerServeur.traiterFin());	
	}

}
