package tdSi;

public class Etudiant extends Personne{
	
	private int matriculeEtudiant;
	
	public int getMatriculeEtudiant() {
		return matriculeEtudiant;
	}

	public void setMatriculeEtudiant(int matriculeEtudiant) {
		this.matriculeEtudiant = matriculeEtudiant;
	}

	@Override
	public void calculPrime() {
		// TODO Auto-generated method stub
		
		int primeEtudiant = 50;
		
		System.out.println("La prime d'excelence de cet etudiant est de  "+primeEtudiant+" FCFA");
		
		super.calculPrime();
	}


}
