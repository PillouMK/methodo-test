package labJunit.app;

public class CompteBancaire {
	double solde;
	
	public CompteBancaire() {
		this.solde = 1000;
		System.out.println("Compte bancaire");
	}
	
	public double debiterSolde(double a) {
		if(a >= 0) {	
			this.solde -= a;
			return this.solde;
		} else throw new Error("Le débit doit être positif");
	}
	
	public double crediterSolde(double a) {
		if(a >= 0) {	
			this.solde += a;
			return this.solde;
		} else throw new Error("Le crédit doit être positif");
	
	}

}
