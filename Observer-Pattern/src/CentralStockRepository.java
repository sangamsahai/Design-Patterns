import java.util.ArrayList;

//This repository keeps track of the top performing Stock in the market.
public class CentralStockRepository implements Subject{

	private ArrayList<Observer> observers;
	
	private String stockName;
	private float stockValue;
	
	public  CentralStockRepository() {
		observers =  new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	
	public void removeObserver(Observer o) {
		int i=observers.indexOf(o);
				if(i>=0)
				{
					observers.remove(i);
				}
	}

	//This method is used to send the information to all the Observers
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++)
		{
			Observer observer=observers.get(i);
			observer.update(stockName,stockValue);
		}
	}

	public void newTopStockRecorded()
	{
		notifyObservers();
	}
	
	
	public void setNewTopStock(String stockName,float stockValue)
	{
		this.stockName=stockName;
		this.stockValue=stockValue;
		newTopStockRecorded();
	}

	
	/*Please note that these getters are not required.
	 * We are just writing the getters just in case any class needs it.
	 * But the observers would never be needing/using these getters.
	 * They will be notified of the new data by the Subject itself
	 * when the Subject will call the update method
	 * on all the observers*/
	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public String getStockName() {
		return stockName;
	}

	public float getStockValue() {
		return stockValue;
	}
	
	
}
