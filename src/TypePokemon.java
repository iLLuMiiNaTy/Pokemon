
public enum TypePokemon {
	FEU("Feu"),
	EAU("Eau"),
	PLANTE("Plante");
	
	private String affichage;

	private TypePokemon(String s) {
		affichage = s;
	}
	
	public String toString() {
		return affichage;
	}

}
