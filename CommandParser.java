import java.util.*;
import java.io.*;

class CommandParser{
	private PokemonFarm pokemonFarm;
	private Scanner commandScanner;
	private boolean isRunning;

	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("\nWhat do you want?(List, Add, Remove, Feed, Walk, Quit): ");
			command = commandScanner.next();
			// System.out.println("You type \'"+command+"\'");
			if(command.equalsIgnoreCase("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equalsIgnoreCase("add"))
				this.addPokemon();
			else if(command.equalsIgnoreCase("list"))
				this.listPokemons();
			else if(command.equalsIgnoreCase("feed"))
				this.feedPokemons();
			else if(command.equalsIgnoreCase("walk"))
				this.walkPokemons();
			else if(command.equalsIgnoreCase("remove"))
				this.removePokemons();
			else if(command.equalsIgnoreCase("go to forest"))
				this.gotoForest();
		}

	}

	private void addPokemon(){
		commandScanner.nextLine();
		// input name weight length
		System.out.print("Enter pokemon type: ");
		String pokemonType = commandScanner.nextLine();
		String name = "name";
		float weight = 0f;
		float stepLength = 0f;
		
		System.out.print("Enter pokemon name: ");
		name = commandScanner.nextLine();
		System.out.print("Enter pokemon weight: ");
		weight = commandScanner.nextFloat();
		System.out.print("Enter pokemon step length: ");
		stepLength = commandScanner.nextFloat();

		if(pokemonType.equalsIgnoreCase("zubat")){
			Zubat zubat = new Zubat(name, weight, stepLength);
			pokemonFarm.addPokemon(zubat);
		}
		if(pokemonType.equalsIgnoreCase("snorlax")){
			Snorlax snorlax = new Snorlax(name, weight, stepLength);
			pokemonFarm.addPokemon(snorlax);
		}
		if(pokemonType.equalsIgnoreCase("pikachu")){
			Pikachu pikachu = new Pikachu(name, weight, stepLength);
			pokemonFarm.addPokemon(pikachu);
		}

	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List");
		System.out.println("==========================================");
		this.pokemonFarm.list();
		System.out.println("==========================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed?: ");
		String name = this.commandScanner.next();
		pokemonFarm.feed(name);

	}
	
	private void walkPokemons(){
		System.out.print("Which pokemon do you want to walk?: ");
		String name = this.commandScanner.next();
		pokemonFarm.walk(name);
	}

	private void removePokemons(){
		System.out.print("Which pokemon do you want to remove?: ");
		String name = this.commandScanner.next();
		pokemonFarm.rmPokemon(name);
	}

	private void gotoForest(){
		/*System.out.print("Found" + random pokemon class name function);
		System.out.print("Choose your ball(pokeball, greatball, ultraball): ");
		String ball = this.commandScanner.next();
		float opp;
		if(ball.equalsIgnoreCase("pokeball")){
			opp = balls.pokeball() * pokemon mood ;
			if(opp >= 0.5)
				pokemonFarm.addPokemon(pokemon type);
		}
		else if(ball.equalsIgnoreCase("greatball")){
			opp = balls.greatball() * pokemon mood;
			if(opp >= 0.5)
				pokemonFarm.addPokemon(pokemon type);
		}
		else if(ball.equalsIgnoreCase("ultraball")){
			opp = balls.ultraball() * pokemon mood;
			if(opp >= 0.5)
				pokemonFarm.addPokemon(pokemon type);
		}*/
	}
}

