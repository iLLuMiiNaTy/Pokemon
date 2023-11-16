import java.util.Random;

public abstract class Pokemon {
	
	private String nom;
	private int niveau;
	private int niveauMax = 100;
	protected float hp;
	protected float atk;
	private TypePokemon type;
	public java.util.Random random = new Random();
	
	
	public Pokemon(String nom, TypePokemon type) {
		this.nom = nom;
		this.type = type;
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


	public float getHp() {
		return hp;
	}
	
	public TypePokemon getType() {
		return type;
	}


	public float getAtk() {
		log(this.nom + " utilise Trempette");
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
	
	public abstract void attaquer(Pokemon p);
	
	public abstract void subir(Pokemon p);
	
	public String toString() {
		return ("[Pokemon " + this.nom + "]" + "\n Nom : " + this.nom + "\n Niveau : " + this.niveau + 
				"\n Point de vie : " + this.hp + "\n Attaque : " + this.atk + "\n Type : " + this.type);
	}
	
	public void log(String msg) {
		System.out.println("--------------------------------");
		System.out.println(msg);
	}
	
	
	
	

}
