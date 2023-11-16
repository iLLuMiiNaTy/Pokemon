
public class PokemonFeu extends Pokemon{

	public PokemonFeu(String nom) {
		super(nom, TypePokemon.FEU);
		
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
			log("SUPER EFFICACE ! \n" + this.getNom() + " subit " + 2*p.getAtk() + " de dégats!");
			this.hp = this.hp - 2*p.getAtk();
			break;
		case FEU : 
			log("PEU EFFICACE \n " + this.getNom() + " subit " + 1/2*p.atk + " de dégats!");
			this.hp = this.hp - 1/2*p.getAtk();
			break;
		case PLANTE : 
			log("PEU EFFICACE \n" + this.getNom() + " subit " + 1/2*p.getAtk() + " de dégats!");
			this.hp = this.hp - 1/2*p.getAtk();
			break;
		}
	}

}
