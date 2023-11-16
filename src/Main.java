
public class Main {

	public static void main(String[] args) {
		testPokemon1();

	}
	
	private static void testPokemon1() {
		// test Pokemon1
		System.out.println("\nTEST POKEMON1\n");
		Pokemon p1 = new PokemonFeu("Salamèche");
		Pokemon p2 = new PokemonEau ("Carapuce");
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());	
	}

}
