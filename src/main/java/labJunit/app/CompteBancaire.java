package labJunit.app;

public class CompteBancaire {
	double solde;
	
	public CompteBancaire() {
		System.out.println("Compte bancaire");
	}
	
	public double debiterSolde(double a) {
		if(a >= 0) {	
			this.solde -= a;
			return this.solde;
		} else return 0;
	}
	
	public double crediterSolde(double a) {
		if(a >= 0) {	
			this.solde += a;
			return this.solde;
		} else return 0;
	
	}

}
