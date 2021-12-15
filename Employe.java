package tdSi;

public class Employe extends Personne{
	
	prevate int matriculeEmploye;
	

	public int getMatriculeEmploye() {
		return matriculeEmploye;
	}



	public void setMatriculeEmploye(int matriculeEmploye) {
		this.matriculeEmploye = matriculeEmploye;
	}


	@Override
	public void calculPrime() {
		// TODO Auto-generated method stub
		
		int primeFixeEmploye = 50;
		int salaire = 200;
		int salaireTotal;
		
		salaireTotal = primeFixeEmploye + salaire;
		
		System.out.println("La prime d'excelence de cet employe est de  "+salaireTotal+" FCFA");
		
		
		super.calculPrime();
		
		
	}
}
