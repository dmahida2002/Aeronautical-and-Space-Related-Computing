import java.util.Arrays;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;

public class SpaceSystem {
	
	private Calculations calculate = new Calculations();
	
	private Graph mySystem;
	
	private int currentBody;
	
	private InformationScraper scraper = new InformationScraper();
	
	public SpaceSystem() {
		
		int count = (int)(Math.random()*(9 - 1 + 1) + 1);
		
		try {
			
			generateNewSystem(scraper.getPlanetNames(count), count);
		} 
		
		catch (IOException e) {
			
			System.out.println("Something went wrong.");
		}
	}
	
	public String getCurrentLocation() {
		
		return (String) mySystem.getLabel(currentBody);
	}
	
	public int getCurrentLocationRaw() {
		
		return currentBody;
	}
	
	public String getNeighbors() {
		
		int numberOfNeighbors = (mySystem.neighbors(currentBody).length);
		
		int[] indexOfNeighbors = mySystem.neighbors(currentBody);
		
		String neighborsTranslate[] = new String[numberOfNeighbors];
		
		for(int i = 0; i < numberOfNeighbors; i++) {
			
			neighborsTranslate[i] = (String)mySystem.getLabel(indexOfNeighbors[i]);
		}
		
		return Arrays.toString(neighborsTranslate);
		
	}
	
	public String getNeighborsRaw() {
		
		return Arrays.toString(mySystem.neighbors(currentBody));
	}
	
	public String getCharacteristics() {
		
		Object getDetails[] = mySystem.getProperties(currentBody);
		
		String getChars = "Mass: " + getDetails[0].toString() + " kg";
		
		getChars += "\nGravitational Pull: " + getDetails[1].toString() + " m/s�";
		getChars += "\nRadius: " + getDetails[2].toString() + " meters";
		
		return getChars;
	}
	
	public int getSystemSize() {
		
		return mySystem.size();
	}
	
	private void generateNewSystem(String names[], int count) {
		
		mySystem = new Graph(count);
		
		calculate.addCharacteristics(mySystem, names, count);
		
		int initialLocation = 0;
		
		while(initialLocation == 0) {
			
			initialLocation = (int)(Math.random()*((mySystem.size() - 0)) + 0);
			
			currentBody = initialLocation;
		}
		
		for(int i = 0; i < mySystem.size(); i++) {
			
			for(int j = 0; j < mySystem.size(); j++) {
				
				// Do not add the body you are currently at as an edge.
				
				if(j == currentBody) {
					
					continue;
				}
				
				mySystem.addEdge(i, j);
			}
		}
	}
	
	public void travelTo(int position) {
		
		if(position > mySystem.size()) {
			
			System.out.println("That body does not exist.");
		}
		
		else {
			
			currentBody = position;
		}
		
	}
	
	public void getMap() {
		
		try {
			
			scraper.getMap(mySystem.size(), getCurrentLocationRaw());
		} 
		
		catch (IOException e) {
			
			System.out.println("Something went wrong.");
		}
	}
}
