
public class PokemonPlante extends Pokemon{

	public PokemonPlante(String nom) {
		super(nom, TypePokemon.PLANTE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attaquer(Pokemon p) {
		log(this.getNom() + " attaque " + p.getNom());
		p.subir(this);	
	}

	@Override
	public void subir(Pokemon p) {
		switch(p.getType()) {
		case EAU : 
			log("PEU EFFICACE \n" + this.getNom() + " subit " + 1/2*p.getAtk() + " de dégats!");
			this.hp = this.hp - 1/2*p.getAtk();
			break;
		case FEU : 
			log("SUPER EFFICACE ! \n" + this.getNom() + " subit " + 2*p.getAtk() + " de dégats!");
			this.hp = this.hp - 2*p.getAtk();
			break;
		case PLANTE : 
			log("PEU EFFICACE \n" + this.getNom() + " subit " + 1/2*p.getAtk() + " de dégats!");
			this.hp = this.hp - 1/2*p.getAtk();
			break;
		}
	}

}
