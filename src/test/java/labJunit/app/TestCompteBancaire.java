package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompteBancaire {

	
	
	@Test
	void testDebiterSolde1() {
		CompteBancaire cb = new CompteBancaire();
		cb.solde = 1000;
		double debit = 15.0;
		assertEquals(985, cb.debiterSolde(debit));
		
	}
	
	@Test
	void testDebiterSolde2() {
		CompteBancaire cb = new CompteBancaire();
		cb.solde = 1000;
		double debit = -15.0;
		assertEquals(985, cb.debiterSolde(debit));
	}
	
	@Test
	void testCrediterSolde1() {
		CompteBancaire cb = new CompteBancaire();
		cb.solde = 1000;
		double credit = 15.0;
		assertEquals(1015, cb.crediterSolde(credit));
	}
	
	@Test
	void testCrediterSolde2() {
		CompteBancaire cb = new CompteBancaire();
		cb.solde = 1000;
		double credit = -15.0;
		assertEquals(1015, cb.crediterSolde(credit));
	}
}
