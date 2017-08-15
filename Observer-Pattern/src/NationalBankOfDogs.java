//This Bank is an Observer.
//This bank shows the details of the top Stock to its customers
//whenever there is a new top Stock in the market
public class NationalBankOfDogs implements Observer,DisplayUnit{

	private String stockName;
	private float stockValue;
	private Subject centralStockRepository;
	
	public NationalBankOfDogs(Subject centralStockRepository)
	{
		this.centralStockRepository = centralStockRepository;
		centralStockRepository.registerObserver(this);
	}
	
	
	public void update(String stockName,float stockValue)
	{
		this.stockName = stockName;	
		this.stockValue = stockValue;
		display();
	}
	
	public void display()
	{
		System.out.println("This is NationalBankOfDogs. Top Stock data has been updated !");
		System.out.println("Current highest stock is - "+stockName+" with value of "+stockValue+"$");
	}
}
