
public abstract class Dog {
	
	//These are the behaviors which can vary between sub classes.
	//The variants are limited so we can have interfaces for these
	//We use composition for these play and walk behaviors
	PlayBehavior playBehavior;
	WalkBehavior walkBehavior;
	
	public  Dog()
	{
	}
	
	//The variant of this can be huge. 
	//Some dogs eat bone , some rice , some chicken etc.
	//So we will not make an interface for this.
	//This will be implemented as per the specifics of the sub class 
	// Example - eat bone , eat rice , etc
	abstract void eat();
	
	public void performWalk()
	{
		walkBehavior.move();
	}
	
	public void performPlay()
	{
		playBehavior.play();
	}

	//All dogs can bark !
	//This is common functionality which all the sub classes can use
	//Hence, we can use inheritance for any behavior if all the sub classes have the same behavior.
	public void bark()
	{
		System.out.println("Every dog barks !! ");
	}

	public void setPlayBehavior(PlayBehavior playBehavior) {
		this.playBehavior = playBehavior;
	}

	public void setWalkBehavior(WalkBehavior walkBehavior) {
		this.walkBehavior = walkBehavior;
	}
	
	
	
}
