
public class MainDogSimulator {
	
	public static void main(String[] args)
	{
		Labrador labrador = new Labrador();
		GreatDane greatDane = new GreatDane();
		
		labrador.performPlay();
		labrador.performWalk();
		
		greatDane.performPlay();
		greatDane.performWalk();
	}

}
