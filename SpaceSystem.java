import java.util.Arrays;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

public class SpaceSystem {
	
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
	
	public SpaceSystem(String solar) {
		
		/* 9 planets in our system but passed a value of (10 + 1) because we are including
		 * a star.
		 * 
		 * Maybe we could have 2 stars like the system Luke Skywalker lived in...
		 */
		
		mySystem = new Graph(10);
		
		/* The setLabel() method has the following parameters:
		 * 
		 * - Label #
		 * - Label name
		 * - Label mass
		 * - Label gravitational pull (in m/s�)
		 * - Label radius (in miles)
		 */
		
		mySystem.setLabel(0, "Sun", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(1, "Mercury", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(2, "Venus", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(3, "Earth", new BigInteger("5972000000000000000000000"), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(4, "Mars", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(5, "Jupiter", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(6, "Saturn", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(7, "Uranus", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(8, "Neptune", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(9, "Pluto", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		/* Starting position is 3 (Earth). We will add edges to all
		 * bodies connecting them to every other bodies in the system.
		 * 
		 * In other words, every planet should have access to travel to entire system but itself.
		 */
		
		currentBody = 3;
		
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
		
		BigInteger getDetails[] = mySystem.getProperties(currentBody);
		
		String getChars = "Mass: " + getDetails[0] + " kg";
		
		getChars += "\nGravitational Pull: " + getDetails[1] + " m/s�";
		getChars += "\nRadius: " + getDetails[2] + " mi";
		
		return getChars;
	}
	
	public int getSystemSize() {
		
		return mySystem.size();
	}
	
	private void generateNewSystem(String names[], int count) {
		
		mySystem = new Graph(count);
		
		BigInteger massValue = new BigInteger("0");
		BigInteger gravValue = new BigInteger("0");
		BigInteger radValue = new BigInteger("0");
		
		for(int i = 0; i < count; i++) {
			
			mySystem.setLabel(i, names[i], massValue, gravValue, radValue);
		}
		
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
	
	public void getMap() {
		
		try {
			
			scraper.getMap(mySystem.size(), getCurrentLocationRaw());
		} 
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
