class Balls{
	private float opportunity;
	public Balls(float opportunity){
		this.opportunity = opportunity;
	}

	public float pokeball(){
		this.opportunity = 0.8f;
		return this.opportunity;
	}

	public float greatball(){
		this.opportunity = 0.9f;
		return this.opportunity;
	}

	public float ultraball(){
		this.opportunity = 1.0f;
		return this.opportunity;
	}
}
