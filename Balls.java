class Balls{
	public double opportunity;

	public Balls(){
		this.opportunity = 0;
	}

	public double getOpportunity(){
		return opportunity;
	}

	public boolean catchPokemon(float mood){
		if((mood * opportunity) > 0.5){
			return true;
		}
		else{
			return false;
		}
	}
}
