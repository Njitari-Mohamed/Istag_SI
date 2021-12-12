package tdSi;


public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Etudiant etu = new Etudiant();
		Employe em = new Employe();
		
		etu.setNom("Malonga");
		etu.setPrenom("George");
		etu.setAge(20);
		etu.setDateNaissance("25/12/2021");
		etu.setAdresse("Essos Camp Sonel");
		etu.setMatriculeEtudiant(456);
		
		em.setNom("Koffi");
		em.setPrenom("Samuel");
		em.setAge(45);
		em.setDateNaissance("Bertoua");
		em.setAdresse("TAM TAM");
		em.setMatriculeEmploye(234);
		
		System.out.printf("Le nom de cet etudiant est "+etu.getNom()+", "+etu.getPrenom()+" son matricule est "+etu.getMatriculeEtudiant()+" il est age de "+etu.getAge()+", il est ne en "+etu.getDateNaissance()+" et il reside a "+etu.getAdresse());
		etu.calculPrime();
		
		System.out.printf("Le nom de cet employe est "+em.getNom()+", son prenom "+em.getPrenom()+" son matricule est "+em.getMatriculeEmploye()+" il est age de "+em.getAge()+", il est ne en "+em.getDateNaissance()+" et il reside a "+em.getAdresse());
		em.calculPrime();
			

	}

}
