
import java.util.*;

class Pokemon{
	private String name;
	private float weight;
	private float stepLength;
	private int step;
	private float gainingWeightStep;
	private String[] types;
	private float mood;

	public Pokemon(String name,
		       float weight,
		       float stepLength,
		       float gainingWeightStep,
		       String[] types){
		this.name = name;
		this.weight = weight;
		this.mood = mood;
		this.stepLength = stepLength;
		this.gainingWeightStep = gainingWeightStep;
		step = 0;

		if(types == null)
			this.types = new String[] {"normal"};
		else
			this.types = types;

		Random rand = new Random();
		mood = rand.nextInt(5);

	}

	public void walk(){
		step += 1;
		weight -= gainingWeightStep;
	}

	public void eat(){
		weight += gainingWeightStep;
	}

	public void print(){
		System.out.println("Pokemon name: " + name);
 		System.out.print("        Type: ");
		for(String type: types){
			System.out.print(type+",");
		}
		System.out.println();
		System.out.println("      Weight: " + weight);
		System.out.println(" Step length: " + stepLength);
		System.out.println("  Today Step: " + step);
		System.out.println("------------------------------------------");
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public float getMood(){	
		return this.mood;
	}

}
