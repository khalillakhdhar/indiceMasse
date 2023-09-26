package indiceMasse;

public class Personne {
	private String nom,prenom;
	private int age;
	private double taille,poids;
	
	
	

	public Personne(String nom, String prenom, int age, double taille, double poids) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public double getTaille() {
		return taille;
	}




	public void setTaille(double taille) {
		this.taille = taille;
	}




	public double getPoids() {
		return poids;
	}




	public void setPoids(double poids) {
		this.poids = poids;
	}




	public Personne() {
		// TODO Auto-generated constructor stub
	}
	
	public int indice()
	{
		return (int) Math.round(poids/(taille*taille));
		// Math.round librairie d'arrondie
	}

}
