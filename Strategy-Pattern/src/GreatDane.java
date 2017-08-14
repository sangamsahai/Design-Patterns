
public class GreatDane extends Dog{

	public GreatDane()
	{
		playBehavior = new BiteActing();
		walkBehavior = new LazyWalk();
	}

	@Override
	void eat() {
		System.out.println("I like to eat beef !!");
		
	}
	
	
}
