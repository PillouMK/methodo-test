package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompteBancaire {

	
	
	@Test
	void testDebiterSolde1() {
		CompteBancaire cb = new CompteBancaire();
		double debit = 15.0;
		assertEquals(985.0, cb.debiterSolde(debit));
		
	}
	
	@Test
	void testDebiterSolde2() {
		CompteBancaire cb = new CompteBancaire();
		double debit = -15.0;
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        cb.debiterSolde(debit);
	    });

	    String expectedMessage = "Le débit doit être positif";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testCrediterSolde1() {
		CompteBancaire cb = new CompteBancaire();
		double credit = 15.0;
		assertEquals(1015.0, cb.crediterSolde(credit));
	}
	
	@Test
	void testCrediterSolde2() {
		CompteBancaire cb = new CompteBancaire();
		double credit = -15.0;
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        cb.crediterSolde(credit);
	    });

	    String expectedMessage = "Le crédit doit être positif";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
}
