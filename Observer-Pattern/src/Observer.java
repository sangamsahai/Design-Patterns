
public interface Observer {
	
	//This is the method which the subject will call when it needs to notify 
	//the observer about any change
	public void update(String stockNumber, float stockValue);

}
