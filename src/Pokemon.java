import java.util.Random;

public class Pokemon {
	
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	public java.util.Random random = new Random();
	
	
	public Pokemon(String nom) {
		this.nom = nom;
		this.niveau= random.nextInt(1, 11);
		this.hp = this.niveau*2;
		this.atk = (this.niveau /2)+1;
	}


	public String getNom() {
		return nom;
	}


	public int getNiveau() {
		return niveau;
	}


	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getAtk() {
		log(this.nom + " attaque Trempette");
		return atk;
	}
	
	public Boolean isKO() {
		if (this.hp == 0) {
			log(this.nom + " est tombé KO");
			return true;
		} else {
			return false;
		}
	}
	
	public void soigner() {
		if (this.isKO()) {
			log(this.nom + "se soigne");
			this.hp = this.getNiveau()*2;
		}
	}
	
	public void attaquer(Pokemon p) {
		log(this.nom + " attaque " + p.nom);
		log(p.nom + " subit " + this.atk + " de dégats");
		p.setHp(p.getHp()-this.atk);
	}
	
	public String toString() {
		return ("[Pokemon " + this.nom + "]" + "\n Nom : " + this.nom + "\n Niveau : " + this.niveau + 
				"\n Point de vie : " + this.hp + "\n Attaque : " + this.atk);
	}
	
	public void log(String msg) {
		System.out.println("--------------------------------");
		System.out.println(msg);
	}
	
	
	
	

}
