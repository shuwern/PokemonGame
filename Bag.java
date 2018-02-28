import java.util.*;
class Bag{
	private ArrayList<Pokemon> pokemonBag;
	private Scanner sc;
	private boolean success;

	public Bag(){
		pokemonBag = new ArrayList<Pokemon>();
		sc = new Scanner(System.in);
	}

	public void addItem(Pokemon pokemon){
		pokemonBag.add(pokemon);
	}

	public void listItem(){
		System.out.println("Item in bag");                         
		System.out.println("-------------------------------------");
		for(Pokemon pokemon: pokemonBag){
			pokemon.print();
		}
	}

	public void useBall(String ball, Pokemon wildPokemon){
		if(ball.equalsIgnoreCase("pokeball")){
			Pokeball pokeball = new Pokeball();
			success = pokeball.catchPokemon(wildPokemon.getMood());
		}
		
		else if(ball.equalsIgnoreCase("greatball")){
			Greatball greatball = new Greatball();
			success = greatball.catchPokemon(wildPokemon.getMood());
		}

		else if(ball.equalsIgnoreCase("ultraball")){
			Ultraball ultraball = new Ultraball();
			success = ultraball.catchPokemon(wildPokemon.getMood());
		}

		if(success){
			System.out.println("Success!!!");
			System.out.print("Your new pokemon need a name: ");
			String name = sc.nextLine();
			wildPokemon.setName(name);
			addItem(wildPokemon);
		}
		else {
			System.out.println("Wild pokemon escape...");
		}
	}
}
