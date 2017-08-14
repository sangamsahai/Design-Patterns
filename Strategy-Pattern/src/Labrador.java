
public class Labrador extends Dog{
	
	public Labrador()
	{
		playBehavior = new Fetch();
		walkBehavior = new Gallop();
	}

	@Override
	void eat() {
		System.out.println("I like to eat chicken and rice");
		
	}

}
