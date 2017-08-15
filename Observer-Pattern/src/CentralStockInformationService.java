
//This service is responsible for sending the information out to Observers
public class CentralStockInformationService {
	
	public static void main(String[] args)
	{
		
		//create the Subject
		CentralStockRepository centralStockRepository = new CentralStockRepository();
		
		//Create 2 observers for the Central Stock Repository
		//We pass the centralStockRepository object to each observer
		//Each observer saves the centralStockRepository and immediately calls the
		//registerObserver method to register itself to the observer
		NationalBankOfDogs nationalBankOfDogs = new NationalBankOfDogs(centralStockRepository);
		NationalBankOfPups nationalBankOfPups = new NationalBankOfPups(centralStockRepository);
		
		//Now we change the stock data in the subject
		centralStockRepository.setNewTopStock("Labrador Shipping", 100.5f);
		centralStockRepository.setNewTopStock("Spitz Consultancy", 200);
		
		//Removing nationalBankOfPups from the list of observers
		centralStockRepository.removeObserver(nationalBankOfPups);
		centralStockRepository.setNewTopStock("GreatDane Foods", 300);
		
		
		
	}

}
