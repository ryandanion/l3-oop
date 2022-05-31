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
	
	void testTraiterFin() {
		ControllerServeur.traiterCaractereRecuperer("a");
		ControllerServeur.traiterCaractereRecuperer("b");
		ControllerServeur.traiterCaractereRecuperer(" ");
		ControllerServeur.traiterCaractereRecuperer(" ");
		ControllerServeur.traiterCaractereRecuperer("c");
		ControllerServeur.traiterCaractereRecuperer(".");
		ControllerServeur.traiterCaractereRecuperer("c");
		ControllerServeur.traiterCaractereRecuperer("d");
		ControllerServeur.traiterCaractereRecuperer("e");
		
		org.junit.jupiter.api.Assertions.assertEquals(" ab  c.cde", ControllerServeur.traiterFin());
		
		
	}

}
